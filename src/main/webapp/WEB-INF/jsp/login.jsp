<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/12
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>

<form action="/doLogin" method="post">
    name:<input type="text" name="username"><br>
    password:<input type="password" name="password"><br>
    <input type="submit" value="login"><input type="reset" value="reset">
</form>
</body>
</html>
