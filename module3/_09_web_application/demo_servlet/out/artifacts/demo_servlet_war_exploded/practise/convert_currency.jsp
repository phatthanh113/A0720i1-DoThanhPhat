<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/25/2020
  Time: 11:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert Currency</title>
</head>
<body>
<form action="convert" method="post">
    USD <input type="text"name="usd">
    Rate <input type="text" name="rate" value="22000" readonly>
    <input type="submit" value="Convert">
</form>
<h1>${vnd}</h1>
</body>
</html>
