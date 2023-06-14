package com.yt.ziroom.mapper;

import com.yt.ziroom.domain.Tenant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TenantMapper {
    void register(Tenant tenant);
    String queryPhone(String phone);
    @Select("select * from tenant where tNickname=#{tNickname} and tPassword=#{tPassword}")
    Tenant login(Tenant tenant);
}
