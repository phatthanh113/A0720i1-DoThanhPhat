<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/26/2021
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="calculate" method="post">
    <input type="number" name="first">
    <input type="number" name="second">
    <button name="sign" type="submit" value="+">+</button>
    <button name="sign" type="submit" value="-">-</button>
    <button name="sign" type="submit" value="*">*</button>
    <button name="sign" type="submit" value="/">/</button>
</form>
    Result : ${result}
</body>
</html>
