package com.service.impl;

import com.mapper.UserMapper;
import com.model.Person;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Person selectUser(int id) {
        System.out.println("ceshi");
        return userMapper.selectUser(id);
    }
}
