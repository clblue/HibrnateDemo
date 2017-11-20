<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/20
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户详细信息</title>
</head>
<body>
<center>
    <h2>用户详细信息</h2>
    <table border="1">
        <s:set var="user" value="#request.user"/>
        <tr>
            <td>用户ID</td>
            <td><s:property value="#user.id"/></td>
        </tr>
        <tr>
            <td>用户名</td>
            <td><s:property value="#user.username"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><s:property value="#user.password"/></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><s:property value="#user.age"/></td>
        </tr>
        <tr>
            <td>生日</td>
            <td><s:property value="#user.birth"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><s:property value="#user.email"/></td>
        </tr>
    </table>
    <a href="showAllUser.action">返回用户列表</a>
</center>
</body>
</html>
