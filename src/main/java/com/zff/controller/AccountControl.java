package com.zff.controller;

import com.zff.domain.Account;
import com.zff.domain.AccountList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// 路径不带斜杠
@RequestMapping(path="param")
@Controller
public class AccountControl {
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
