package com.start.controller;

import com.start.intenface.IMyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/9/26.
 */
@Controller
@RequestMapping(value = "/dubbo")
public class MyController {

    @Autowired
    private IMyInterface myInterfence;

    @RequestMapping(value = "/test")
    public String test(Model model){
        String s = myInterfence.hello();
        System.out.println("1111");
        return "index";
    }
}
