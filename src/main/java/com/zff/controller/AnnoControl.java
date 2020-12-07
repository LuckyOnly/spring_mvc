package com.zff.controller;

import com.zff.domain.Account;
import com.zff.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping(path = "anno")
public class AnnoControl {
    /**
     * 根据RequestParam获取入参 
     * @param username1
     * @param password1
     * @return
     */
    @RequestMapping(path = "/params")
    private String params(@RequestParam(name="username")String username1,@RequestParam(name="password")String password1){
        System.out.println(username1+"----"+password1);
        return "success";
    }

    /**
     * 使用requestbody获取入参
     * @param body
     * @return
     */

    @RequestMapping(path = "/body")
    private String body(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    /**
     * 根据请求连接获取入参
     * @param id
     * @return
     */
    @RequestMapping(path="/pathvariblr/{ccid}")
    private String pathVar(@PathVariable(name = "ccid")String id){
        System.out.println(id);
        return "success";
    }

    /**
     * 获取请求头中 accept字段的值
     * @param id
     * @return
     */
    @RequestMapping(path="/requestheader")
    private String header(@RequestHeader(name = "accept")String id){
        System.out.println(id);
        return "success";
    }

    /**
     * 获取cookie中的JSESSIONID
     * @param id
     * @return
     */
    @RequestMapping(path="/testCookieValue")
    private String testCookieValue(@CookieValue(name = "JSESSIONID")String id){
        System.out.println(id);
        return "success";
    }

    /**
     * 使用表单封装
     * @param body
     * @return
     */

    @RequestMapping(path="/testModelAttribute")
    private String testModelAttribute(@ModelAttribute("abc") Account body){
        System.out.println(body);
        return "success";
    }

    /**
     * 该方法优于其他controller执行
     * @param username
     * @return 有返回值
     */

//    @ModelAttribute
//    public Account show(String username){
//        Account account=new Account();
//        account.setUsername(username);
//        account.setMoney(1.2f);
//        User user=new User();
//        user.setUname(username);
//        user.setAge(5);
//        account.setUser(user);
//        System.out.println("show 方法");
//        return account;
//    }

    /**
     * 该方法优于其他controller执行
     * @param username
     * @param map
     * 没有返回值
     */
    @ModelAttribute
    public void show(String username, Map<String,Account> map){
        Account account=new Account();
        account.setUsername(username);
        account.setMoney(1.2f);
        User user=new User();
        user.setUname(username);
        user.setAge(5);
        account.setUser(user);
        System.out.println("show 方法");
        map.put("abc",account);
    }
}

