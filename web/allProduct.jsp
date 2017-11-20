<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/18
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>所有产品</title>
</head>
<body>
<center>
    <h2>所有产品</h2>
    <table border="1">
        <tr>
            <td>产品ID</td>
            <td>名称</td>
            <td>价格</td>
            <td>是否删除</td>
            <td>是否更新</td>
        </tr>
        <s:iterator value="#request.all_product" var="product">
            <tr>
                <td><s:property value="#product.id"/></td>
                <td><s:property value="#product.name"/></td>
                <td><s:property value="#product.price"/></td>
                <td><a href="delete.action?id=<s:property value='#product.id'/>">删除</a></td>
                <td><a href="update.jsp?id=<s:property value='#product.id'/>">更新</a></td>
                <td></td>
            </tr>
        </s:iterator>
    </table>
    <a href="add.jsp">添加商品</a>
</center>
</body>
</html>
