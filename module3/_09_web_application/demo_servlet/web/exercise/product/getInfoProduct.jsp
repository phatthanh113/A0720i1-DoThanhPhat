<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/25/2020
  Time: 11:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
    <table>
    <tr>
        <th>Name</th>
        <th>List Price</th>
        <th>Discount Percent</th>
        <th>Discount Amount</th>
        <th>Discount Price</th>
    </tr>
        <tr>
            <td>${product.getName()}</td>
            <td>${product.getListPrice()}</td>
            <td>${product.getPercentDiscount()}</td>
            <td>${discountAmount}</td>
            <td>${discountPrice}</td>
        </tr>
    </table>
</body>
</html>
