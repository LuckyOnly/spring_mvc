<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        //加载页面
        $(function () {
            $("#btn").click(function () {
                // alert("hello");
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"haha","age":"1","birthday":"2000-10-01"}',
                    dataType:"json",
                    type:"post",
                    success:function (data){
                        alert(data.username);
                    }
                })
            });

        });
    </script>
</head>
<body>
<button id="btn">发送ajax</button>
</body>
</html>