package com.yt.ziroom;

import com.yt.ziroom.mapper.TenantMapper;
import com.yt.ziroom.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZiroomApplicationTests {
    @Autowired
    TenantMapper tenantMapper;
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
    }
    @Test
    void testQueryPhone(){
        tenantMapper.queryPhone("19090");
        userMapper.getUser();
    }

}
