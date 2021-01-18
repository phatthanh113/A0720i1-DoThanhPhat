<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/7/2021
  Time: 10:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js" type="text/javascript"></script>
    <script src="js/customer/search.js" type="text/javascript"></script>
    <script src="js/customer/validate.js" type="text/javascript"></script>
</head>
<body>
    <h1>Show infomation Product</h1>
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
        <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td>${product.producer}</td>
            <td><a href="?action=edit&id=${product.id} ">Edit</a></td>
            <td><a id="delete" href="?action=delete&id=${product.id}" >Delete</a></td>
            <td><a id ="edit" href="?action=view&id=${product.id}" >Infomation</a></td>
        </tr>
        </c:forEach>
    </table>
    <a href="?action=create">Add Product</a>
    <form action="product" method="post">
        <input type="text" name="nameProduct">
        <input type="submit" value="Tìm kiếm">
        <input type="hidden" name="action" value="search">
    </form>
    Product Name: <input type="text" id="nameProduct">
    <input type="button" id="search" value="Submit" >
    <hr/>
    <div id="result"></div>
</body>
</html>
