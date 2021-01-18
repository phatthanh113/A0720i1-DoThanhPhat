<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/7/2021
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Customer</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>Name</td>
            <td>${customer.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${customer.name}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${customer.email}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${customer.address}</td>
        </tr>
    </table>
    <p><a href="customer">Back to main menu</a></p>
</body>
</html>
