package com.yt.ziroom.controller;


import com.yt.ziroom.domain.Tenant;
import com.yt.ziroom.service.TenantService;
import com.yt.ziroom.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tenant")
@CrossOrigin
public class TenantController {
    @Autowired
    TenantService tenantService;
    @PostMapping ("/register.do")
    @ResponseBody
//    @RequestBody  接受前端传递来的json格式
    public JsonResult register(@RequestBody Tenant tenant){


        return tenantService.register(tenant);
    }

    @PostMapping ("/login.do")
    @ResponseBody
    public JsonResult login(@RequestBody Tenant tenant){
        return tenantService.login(tenant);
    }


}
