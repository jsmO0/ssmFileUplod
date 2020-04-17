<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: euihajs
  Date: 4/17/2020
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>下载文件</title>
    <style>
        #div {
            position:absolute;
            top:50%;
            left:50%;
            margin:-150px 0 0 -200px;
            width:400px;
            height:300px;
            border-style:solid;
            border-width:1px;
            border-color:#000;
            background:#FFFF00;
            color:#FFF
        }
        #select
        {
            border: 2px solid #5cb85c;
            width: 118px;
            height: 34px;
        }
    </style>

</head>
<body>
<% List<String> fileNameList = (List<String>) request.getAttribute("fileNameList"); %>
<div id="div">
    <form action="download.do" method="post">
        <select id="select" name="fileName">
            <%
                for ( String fileName: fileNameList
                     ) {
                    %><option name=""><%=fileName%></option>
            <%
                }
            %>
        </select><br><br>
        <input type="submit" >
    </form>
</div>
</body>
</html>
