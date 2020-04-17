<%--
  Created by IntelliJ IDEA.
  User: euihajs
  Date: 4/17/2020
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <script>
        function check(){
            if(registerForm.username.value == ""){
                window.alert("请输入用户名")
                return false;
            }
            if(registerForm.password.value == ""){
                window.alert("请输入密码");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<div id="div1">
    <form  name="registerForm" action="add_user.do" method="post" onsubmit="return check()">
        用户名:<input type="text" name="username" id="username"><br><br>
        密码: <input type="password" name = "password" id="password"><br><br>
        <input type="submit" value="提交" >
    </form>
</div>
</body>
</html>
