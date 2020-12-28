package com.zff.controller;

import com.zff.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid执行了");
        //转发程序
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //重定向
//        response.sendRedirect(request.getContextPath()+"/index.jsp");
        //自定义页面
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/htnl;charset=UTF-8");
        response.getWriter().println("hello");
        return;
    }

    @RequestMapping(value = "/testAjax")
    public @ResponseBody  User testAjax(@RequestBody User body){
        System.out.println("testAjax...");
        System.out.println(body);
        body.setUsername("你好");
        return body;
    }
}
