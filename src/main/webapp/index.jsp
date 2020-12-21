<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/29
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>地址</title>
</head>
<body>
<h3>小程序</h3>

<a href="anno/setSession">设置session</a>
<a href="anno/getSession">取出session</a>
<a href="anno/delSession">删除session</a>

<form action="anno/testModelAttribute" method="post">

    用户<input type="text" name="username"><br/>
    密码<input type="text" name="password"><br/>
    <input type="submit" value="提交">
</form>
</br>

<h3>获取请求头</h3>
<a href="anno/testCookieValue">cookievalue</a>
<h3>获取请求头</h3>
<a href="anno/requestheader">header</a>
<h3>使用PathVariable获取入参</h3>
<a href="anno/pathvariblr/10001">获取ID</a>
<h3>使用requestbody获取入参</h3>
<!--解决中文乱码-->
<form action="anno/body" method="post">

    用户<input type="text" name="username"><br/>
    密码<input type="text" name="password"><br/>
    <input type="submit" value="提交">
</form>

<h3>使用requestparam获取入参</h3>
<!--解决中文乱码-->
<form action="anno/params" method="post">

    用户<input type="text" name="username"><br/>
    密码<input type="text" name="password"><br/>
    <input type="submit" value="提交">
</form>



<a href="hello2">入门程序</a>

<h3>post表单</h3>
<!--解决中文乱码-->
<form action="param/saveAccount" method="post">
    姓名<input type="text" name="username"><br/>
    密码<input type="text" name="password"><br/>
    金额<input type="text" name="money"><br/>
    用户<input type="text" name="user.uname"><br/>
    年龄<input type="text" name="user.age"><br/>
    <input type="submit" value="提交">
</form>
    <h3>post表单list和map</h3>
    <!--解决中文乱码-->
    <form action="param/saveAccountList" method="post">
        姓名<input type="text" name="username"><br/>
        密码<input type="text" name="password"><br/>
        金额<input type="text" name="money"><br/>
        用户<input type="text" name="list[0].uname"><br/>
        年龄<input type="text" name="list[0].age"><br/>
        用户<input type="text" name="map['one'].uname"><br/>
        年龄<input type="text" name="map['one'].age"><br/>
        <input type="submit" value="提交">
</form>

<h3>post表单自定义类型转换</h3>
<!--解决中文乱码-->
<form action="user/saveUser" method="post">

    用户<input type="text" name="uname"><br/>
    年龄<input type="text" name="age"><br/>
    生日<input type="text" name="birthday"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
