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
        System.out.println("就是测试解决冲突------------");
        System.out.println("66666666666666");
        return userMapper.selectUser(id);
    }
}
