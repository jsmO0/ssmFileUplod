<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
    <style type="text/css">
        body{
            background-color: #AEDD81;
        }
        #div1 {
            position:absolute;
            top:50%;
            left:50%;
            margin:-150px 0 0 -200px;
            width:400px;
            height:300px;
        }
    </style>

    <script src="js/jquery-3.4.1.js"></script>
    <script>
        function checkLogin() {
            var username = $("#username").val().toString();
            var password = $("#password").val().toString();
            $.ajax(
                {
                    type : "POST",
                    url: "User/login.do",
                    data : {
                        "username" : username,
                        "password" : password
                    },
                    dataType:"text",
                    success: function (response) {
                        if(response == "false"){
                            alert("Please use the correct username and password.");
                        }
                        if(response == "true"){
                            window.location.href = "User/index.do";
                        }
                    }
                }
            )
        }
    </script>
</head>
<body>
<div id="div1">
    <form  id="loginForm" action="User/login.do" method="post">
        用户名:<input type="text" name="username" id="username"><br><br>
        密码: <input type="password" name = "password" id="password"><br><br>
        <button onclick="checkLogin()">登录</button>
    </form>
    <a href="User/toRegister.do">去注册</a>
</div>

</body>
</html>
