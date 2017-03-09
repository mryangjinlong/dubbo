<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/19
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    response.setHeader("Pragma","No-cache");
    response.setHeader("Cache-Control","no-cache");
    response.setDateHeader("Expires", -10);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
        ${user.id}  ${user.loginName}  ${user.password}  adsf
</body>
</html>
