<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/26/2021
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/search", method="post">
    <label>English</label>
    <input type="text" name="word" required>
    <input type="submit" value="search">
</form>
<hr>
<c:if test="${vietnamese != null}">
    <h3>English: ${english}</h3>
    <h3>Tiếng Việt: ${vietnamese}</h3>
</c:if>
</body>
</html>
