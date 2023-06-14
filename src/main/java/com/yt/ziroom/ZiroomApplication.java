package com.yt.ziroom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("com.yt.ziroom.mapper")
@EnableWebMvc
public class ZiroomApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZiroomApplication.class, args);
    }

}
