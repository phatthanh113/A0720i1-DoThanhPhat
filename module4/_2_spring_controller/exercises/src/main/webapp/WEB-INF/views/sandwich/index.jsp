<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/26/2021
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="result" method="post">
    <label for="lettuce">Lettuce</label>
    <input type="checkbox" id="lettuce" name="condiments" value="letture">
    <label for="lettuce">Tomato</label>
    <input type="checkbox" id="tomato" name="condiments" value="tomato">
    <label for="lettuce">Mustard</label>
    <input type="checkbox" id="mustard" name="condiments" value="mustard">
    <label for="lettuce">Sprouts</label>
    <input type="checkbox" id="sprouts" name="condiments" value="sprouts">
    <input type="submit" value="submit">
</form>
<h3>
    <h3>${message}</h3>
    <c:forEach items="${results}" var="result">
        ${result}<br>
    </c:forEach>
</h3>
</body>
</html>
