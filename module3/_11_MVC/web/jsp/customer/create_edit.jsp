<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/7/2021
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post" class="form">
    <table border="1">
        <tr>
            <td>ID</td>
            <c:choose>
                <c:when test="${customer.id == null}">
                    <td><input type="text" name="id" value="${random}" readonly></td>
                </c:when>
                <c:otherwise>
                    <td><input type="text" name="id" value="${customer.id}" readonly></td>
                </c:otherwise>
            </c:choose>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" name="address"}></td>
        </tr>
        <tr>
            <td><input type="submit" value="${submit.toUpperCase()}"></td>
            <td><input type="reset" value="Reset"></td>
        </tr>
    </table>
    <input type="hidden" name="action" value="${submit}">
    <a href="customer">Back to list</a>

</form>
</body>
</html>
