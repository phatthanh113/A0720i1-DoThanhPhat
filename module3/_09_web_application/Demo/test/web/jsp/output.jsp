<%--
  Created by IntelliJ IDEA.
  User: linht
  Date: 12/25/2020
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome!</title>
</head>
<body>
<h1>Information!</h1>
<table border="1px black" style="border-collapse: collapse">
    <tr>
        <th>Fullname</th>
        <th>Address</th>
        <th>Age</th>
        <th>Birthday</th>
    </tr>
    <tr>
        <td>${person.fullName}</td>
        <td>${person.address}</td>
        <td>${person.age}</td>
        <td>${person.showBirthday()}</td>
    </tr>
</table>
</body>
</html>
