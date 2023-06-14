package com.yt.ziroom.controller;


import com.yt.ziroom.domain.User;
import com.yt.ziroom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public User getUser(){

        User user = userService.getUser();
        return user;
    }
}
