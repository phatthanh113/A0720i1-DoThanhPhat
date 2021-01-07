<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/25/2020
  Time: 10:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="login" method="post">
   Username : <input type="text" name="username">
   Password : <input type="password" name="password">
    <input type="submit" value="submit">
</form>
<h1>${username}</h1>
</body>
</html>
