<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/7/2021
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js" type="text/javascript"></script>
    <script src="js/customer/search.js" type="text/javascript"></script>
</head>
<body>
<p><a href="?action=create">Create a customer</a></p>
    <table border="1">
        <tr>
            <td>Name</td>
            <td>Email</td>
            <td>Address</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach items="${customerList}" var="customer">
            <tr>
                <td><a href="?action=view&id=${customer.id}">${customer.name}</a></td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td><a href="?action=edit&id=${customer.id}">Edit</a></td>
                <td><a href="?action=delete&id=${customer.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
<form action="customer" method="post">
    <input type="text" name="nameCustomer">
    <input type="submit" value="Gửi">
    <input type="hidden" name="action" value="search">
</form>
<%--<c:set var="customerListSearch" scope="request" value="${customerListSearch}"/>--%>
<c:if test="${customerListSearch.size() != 0}">
    <table border="1">
        <tr>
            <td>Name</td>
            <td>Email</td>
            <td>Address</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach items="${customerListSearch}" var="customer">
            <tr>
                <td><a href="?action=view&id=${customer.id}">${customer.name}</a></td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td><a href="?action=edit&id=${customer.id}">Edit</a></td>
                <td><a href="?action=delete&id=${customer.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
