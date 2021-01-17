package com.zff.controller;

import com.zff.domain.User;
import com.zff.exception.SysException;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

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

    @RequestMapping(value="/fileUpload")
    public String fileUpload(HttpServletRequest request) throws Exception {
        System.out.println("文件上传");
        //上传位置
        String path=request.getSession().getServletContext().getRealPath("/uploads/");
        //判断路径是否存在
        File file=new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        List<FileItem> items=upload.parseRequest(request);
        for(FileItem item:items){
            //当前item对象是否上传文件项
            if(item.isFormField()){

            }else{
                String filename=item.getName();
                String uuid=UUID.randomUUID().toString().replace("-","");
                filename=uuid+"_"+filename;
                item.write(new File(path,filename));
                //删除临时文件
                item.delete();
            }

        }
        return "success";
    }
    @RequestMapping(value="/fileUpload1")
    public String fileUpload1() throws Exception {
        System.out.println("文件上传1");
        return "success";
    }

    @RequestMapping(value = "/exception")
    public String testException() throws SysException {
        System.out.println("请打印testException...");
        // ctrl + alt +t
        try {
            int i =10/0;
        } catch (Exception e) {
            //打印异常信息
            e.printStackTrace();
            //跑出自定义
            throw new SysException("查询出错啦");
        }
        return "success";
    }

    @RequestMapping(value = "/interceptor")
    public String testInterceptor()  {
        System.out.println("请打印testInterceptor...");
        // ctrl + alt +t
//        try {
//            int i =10/0;
//        } catch (Exception e) {
//            //打印异常信息
//            e.printStackTrace();
//            //跑出自定义
//
//        }
        return "success";
    }
}
