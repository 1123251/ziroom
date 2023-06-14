package com.yt.ziroom.service;


import com.yt.ziroom.domain.Tenant;
import com.yt.ziroom.utils.JsonResult;

public interface TenantService {
    JsonResult register(Tenant tenant);

    JsonResult login(Tenant tenant);
}
