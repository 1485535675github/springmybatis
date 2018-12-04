package com.controller;

import com.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

@RestController
public class UserController {

    private  Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;


    @RequestMapping("/showUser/{id}")
    public String selectUser(@PathVariable int id) {
        logger.debug("------------------------------------------>>>>>>>>>>>>>>>>>");
        return userService.selectUser(id).toString();
    }
}