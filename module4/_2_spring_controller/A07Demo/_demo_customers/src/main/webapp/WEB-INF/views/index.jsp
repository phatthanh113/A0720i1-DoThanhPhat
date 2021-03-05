<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html xmlns:th="http://www.thymeleaf.org">
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/26/2021
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
</head>
<body>
    <h2 th:if="${messages}">
        <span th:text="${messages}"></span>
    </h2>

    <a th:href="@{/customers/add}">Add</a>
    <table>
        <thead>
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Age</td>
                <td>Action</td>
            </tr>
        </thead>
    <tbody>
    <c:forEach items="${listCustomer}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.age}</td>
            <td><a href="edit?id=${customer.id}">Edit</a>
                <a href="delete?id=${customer.id}">Delete</a>
            </td>
         </tr>
    </c:forEach>
    </tbody>

    </table>
</body>
</html>
