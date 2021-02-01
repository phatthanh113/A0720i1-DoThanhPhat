<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/26/2021
  Time: 11:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js" type="text/javascript"></script>
    <script src="assert/js/search.js"></script>
</head>
<body>
<main class="container" id="result">
    <jsp:include page="../homepage/homepage.jsp"/>
    <table class="table table-hover table-bordered mt-5">
        <thead class="thead-dark">
        <tr>
            <td scope="col">Name</td>
            <td scope="col">Birthday</td>
            <td scope="col">#</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customerList}" var="customer">
            <tr>
                <td><a href="?action=view&id=${customer.id}">${customer.name}</a></td>
                <td>${customer.birthday}</td>
                <td><a class="btn btn-success btn-lg edit" href="?action=edit&id=${customer.id}" role="button" >Edit</a>
                <a  class="btn btn-danger btn-lg delete" href="?action=delete&id=${customer.id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a class="btn btn-success btn-lg" href="?action=create">Add Product</a>

</main>


<%--<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>--%>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
