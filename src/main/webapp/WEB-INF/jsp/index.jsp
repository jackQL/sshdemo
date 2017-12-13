<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/12
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<table border="1">
    <tr>
        <td>id</td>
        <td>username</td>
        <td>userphoto</td>
        <td>address</td>
        <td colspan="2">do something</td>
    </tr>
    <s:iterator value="list">
        <tr>
            <td><s:property value="id"></s:property> </td>
            <td><img src="<s:property value="userPhoto" /> "width="100px" height="100px"> </td>
            <td><s:property value="username"/> </td>
            <td><s:property value="address"/> </td>
            <td colspan="2">do something</td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
