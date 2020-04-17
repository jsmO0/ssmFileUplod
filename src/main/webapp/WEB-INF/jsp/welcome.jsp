<%--
  Created by IntelliJ IDEA.
  User: jiangshuming
  Date: 2020/4/13
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <div>
   欢迎登录:<h1>${username}</h1><br><br>
   <a href="toDownload.do">点击下载文件</a><br><br>
   <form action="upload.do"  method="post" enctype="multipart/form-data">
       <input type="file" name="uploadFile" ><br><br>
       <input type="submit" value="立即上传">
   </form>
  </div>
</body>
</html>
