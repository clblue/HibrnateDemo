<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/20
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<center>
    <h2>添加用户</h2>
    <s:actionerror/>
    <s:form action="addUser">
        <s:textfield name="username" label="用户名"/>
        <s:password name="password" label="密码"/>
        <s:textfield name="age" label="年龄"/>
        <s:textfield name="birth" label="生日"/>
        <s:textfield name="email" label="Email"/>
        <s:submit value="提交"/>
        <s:reset value="重置"/>
    </s:form>
</center>
</body>
</html>
