<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/4/2021
  Time: 6:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
    <style>
        table {
            width:100%;
        }
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 15px;
            text-align: left;
        }
        #t01 tr:nth-child(even) {
            background-color: #eee;
        }
        #t01 tr:nth-child(odd) {
            background-color: #fff;
        }
        #t01 th {
            background-color: black;
            color: white;
        }
    </style>
</head>
<body>
<form action="new_customer" method="post">
    Name: <input type="text" name="name"/>
    Birthday: <input type="text" name="date"/>
    Address : <input type="text" name="address"/>
    Image : <input type="text" name="image"/>
    <input type="submit" value="Add">
</form>
<br>
<h2>Styling Tables</h2>
<table id="t01">
    <tr>
        <th>Name</th>
        <th>Birthday</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    <c:forEach items="${listCustomer}" var="customer">
    <tr>
        <td>${customer.name}</td>
        <td>${customer.date}</td>
        <td>${customer.address}</td>
        <td><img src="${customer.image}"></td>
    </tr>
    </c:forEach>
</body>
</html>
