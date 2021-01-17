package com.zff.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 */
public class SysExceptionResolve implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        SysException ex=null;
        if(e instanceof SysException){
            ex=(SysException)e;
        }else{
            ex=new SysException(
                    "系统正在维护。。。"
            );
        }

        //创建对象

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("errorMsg",ex.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
