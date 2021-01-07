<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/25/2020
  Time: 11:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Homepage</title>
</head>
<body>
<form action="display-discount" method="post">
    Name Product : <input type="text" name="name">
    List Price Product : <input type="text" name="listPrice">
    Discount Percent <input type="text" name="percent">
    <input type="submit" value="submit">
</form>
</body>
</html>
