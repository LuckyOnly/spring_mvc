package com.zff.controller;

import com.zff.domain.UserDate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "user")
public class UserControl {
    @RequestMapping(path = "/saveUser")
    public String saveUser(UserDate user){
        System.out.println(user);
        return "success";
    }
}
