<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/25/2020
  Time: 8:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get Infomation</title>
</head>
<body>
<table>
    <tr>
        <th>Name</th>
        <th>Address</th>
        <th>Birthday</th>
    </tr>
    <tr>
        <td>${person.name}</td>
        <td>${person.address}</td>
        <td>${person.birthday}</td>
    </tr>
</table>
</body>
</html>
