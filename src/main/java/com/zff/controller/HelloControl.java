package com.zff.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 控制器
 */
@Controller
public class HelloControl {
    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.printf("hello SpringMvc");
        return "success";
    }
}
