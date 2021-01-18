<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/8/2021
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Producer</td>
        <td>Edit</td>
        <td>Delete</td>
        <td>Infomation</td>
    </tr>

    <c:forEach items="${productListSearch}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td>${product.producer}</td>
            <td><a href="?action=edit&id=${product.id}">Edit</a></td>
            <td><a href="?action=delete&id=${product.id}">Delete</a></td>
            <td><a href="?action=view&id=${product.id}">nfomation</a></td>
        </tr>
    </c:forEach>
    <a href="product">Back to main menu</a>
</table>
</table>
</body>
</html>
