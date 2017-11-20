<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/20
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>所有用户</title>
</head>
<body>
<center>
    <h2>所有用户</h2>
    <table border="1">
        <tr>
            <td>用户ID</td>
            <td>用户名</td>
            <td>是否删除</td>
            <td>是否更新</td>
        </tr>
        <s:iterator value="#request.allUser" var="user">
            <tr>
                <td><a href="showUserDetail.action?id=<s:property value="#user.id"/>"><s:property value="#user.id"/></a>
                </td>
                <td><s:property value="#user.username"/></td>
                <td><a href="deleteUser.action?id=<s:property value='#user.id'/>">删除</a></td>
                <td><a href="${pageContext.request.contextPath}/user/updateUser.jsp?id=<s:property value="#user.id"/>">更新</a></td>
            </tr>
        </s:iterator>
    </table>
    <a href="${pageContext.request.contextPath}/user/addUser.jsp">添加用户</a>
</center>
</body>
</html>
