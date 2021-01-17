package com.zff.controller;

import com.zff.domain.Account;
import com.zff.domain.AccountList;
import com.zff.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// 路径不带斜杠
@RequestMapping(path="param")
@Controller
public class AccountControl {
    @Autowired
    private AccountService accountService;
    @RequestMapping(path = "/findAll")
    private String testfindAll(Account account){
//        System.out.println("testfindAll执行啦...");
        accountService.findAll();
        return "success";
    }

    @RequestMapping(path = "/saveAccount")
    private String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }

    @RequestMapping(path = "/saveAccountList")
    private String saveAccountList(AccountList account){
        System.out.println(account);
        return "success";
    }
}
