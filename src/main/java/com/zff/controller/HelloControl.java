package com.zff.controller;

import com.zff.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 控制器
 */
@Controller
public class HelloControl {
    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("hello SpringMvc");
        return "success";
    }

    @RequestMapping(path="/hello2")
    public String sayHello2(){
        System.out.println("hello SpringMvc");
        return "success";
    }


}
