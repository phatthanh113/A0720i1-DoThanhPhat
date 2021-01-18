<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/7/2021
  Time: 11:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create or Edit Product</title>
<%--    <link rel="stylesheet" href="library/bootstrap/css/bootstrap.css">--%>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/library/bootstrap/css/bootstrap.min.css">

</head>
<body>
<form action="product" method="post">
    <table class="table table-hover table-bordered border-1">
            <c:choose>
                <c:when test="${product.id == null}">
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="name"></td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td><input type="text" name="price" ></td>
                    </tr>
                    <tr>
                        <td>Description</td>
                        <td><input type="text" name="description"></td>
                    </tr>
                    <tr>
                        <td>Producer</td>
                        <td><input type="text" name="producer"></td>
                    </tr>

                </c:when>
                <c:otherwise>
                    <td>Id</td>
                    <td><input type="text" name="id" value="${product.id}" readonly></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="name" value="${product.name}" ></td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td><input type="text" name="price" value="${product.price}"></td>
                    </tr>
                    <tr>
                        <td>Description</td>
                        <td><input type="text" name="description" value="${product.description}"></td>
                    </tr>
                    <tr>
                        <td>Producer</td>
                        <td><input type="text" name="producer" value="${product.producer}"></td>
                    </tr>
                </c:otherwise>
            </c:choose>
        <tr>
            <td><input type="submit" value="${submit.toUpperCase()}"></td>
            <td><input type="reset" value="Reset"></td>
        </tr>
        </tr>
    </table>
    <input type="hidden" name="action" value="${submit}">
    <a href="product">Back to list</a>
</form>
    <script type="text/javascript" src="${pageContext.request.contextPath}/library/bootstrap/js/bootstrap.js"></script>
</body>
</html>
