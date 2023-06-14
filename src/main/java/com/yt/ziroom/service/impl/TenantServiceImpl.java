package com.yt.ziroom.service.impl;


import com.yt.ziroom.domain.Tenant;
import com.yt.ziroom.mapper.TenantMapper;
import com.yt.ziroom.service.TenantService;
import com.yt.ziroom.utils.JsonResult;
import com.yt.ziroom.utils.RandomName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TenantServiceImpl implements TenantService {
    @Autowired
    private TenantMapper tenantMapper;

    @Override
    public JsonResult register(Tenant tenant) {

        JsonResult jsonResult = new JsonResult();
//      如果s 不为null 表示数据库 存在  不可重复注册
        String s = tenantMapper.queryPhone(tenant.getTPhone());

        if(s==null){
            RandomName randomName = new RandomName();
            String name = randomName.getName();
            tenant.setTNickname(name);

            tenantMapper.register(tenant);

            jsonResult.setCode(1);
            jsonResult.setInfo("注册成功");
        }else {
            jsonResult.setCode(0);
            jsonResult.setInfo("手机号已存在");
        }

        return jsonResult;
    }

    @Override
    public JsonResult login(Tenant tenant) {
        JsonResult jsonResult = new JsonResult();
//      如果s 不为null 表示数据库 存在  不可重复注册
        Tenant login = tenantMapper.login(tenant);

        if(login==null){

            jsonResult.setCode(0);
            jsonResult.setInfo("登录失败");
        }else {
            jsonResult.setCode(1);
            jsonResult.setInfo(login);
        }

        return jsonResult;
    }
}
