package com.yt.ziroom.service.impl;


import com.yt.ziroom.domain.User;
import com.yt.ziroom.mapper.UserMapper;
import com.yt.ziroom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser() {
        User user = userMapper.getUser();

        return user;
    }
}
