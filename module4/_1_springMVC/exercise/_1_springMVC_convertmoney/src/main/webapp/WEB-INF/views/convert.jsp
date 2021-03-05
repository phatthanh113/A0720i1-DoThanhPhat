<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/22/2021
  Time: 11:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Convert Money</h2>
    <h3>${message}</h3>
    <form action="/convert" method="POST">
        USD : <input type="text" name="usd">
        Rate : <input type="text" value="23000" name="rate" readonly>
        <button type="submit">Submit</button>
    </form>
    VND : <input type="text" value="${vnd}" readonly>
</body>
</html>
