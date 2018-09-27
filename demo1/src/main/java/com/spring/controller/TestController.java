package com.spring.controller;

import com.spring.entity.User;
import com.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hzp on 2018/9/25.
 */
@Controller
@RequestMapping(value = "api/v1")
public class TestController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "test")
    public String test(Model model){
        System.out.println("进入controller");
        User user1 = userService.getUser("hzp");
        User user2 = userService.getUserById("1");
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        return "test";
    }
}
