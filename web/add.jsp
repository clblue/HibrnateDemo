<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/18
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>添加商品</title>
</head>
<body>
<center>
    <h2>添加商品</h2>
    <s:form action="add">
        <s:textfield name="id" label="商品ID"/>
        <s:textfield name="name" label="商品名称"/>
        <s:textfield name="price" label="商品价格"/>
        <s:submit value="提交"/>
        <s:reset value="重置"/>
    </s:form>
</center>
</body>
</html>
