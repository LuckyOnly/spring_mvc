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
<h3> file upload</h3>
<form action="user/fileUpload" method="post" enctype="multipart/form-data">
    选择框：<input type="file" name="upload"/></br>
    <input type="submit" value="提交"/>
</form>
<a href="user/testVoid">响应结果</a>
<h3>异常</h3>
<a href="user/exception">异常</a>

<h3>拦截器</h3>
<a href="user/interceptor">拦截器</a>

</body>
</html>
