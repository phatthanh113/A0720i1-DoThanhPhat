<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/26/2021
  Time: 11:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add or Edit Customer</title>
</head>
<body>
    <form:form action="/customer/${action}" method="post" modelAttribute="customer">
        <form:label path="id">Id : </form:label>
        <form:input path="id" readonly="true"/>
        <form:label path="name">Name : </form:label>
        <form:input path="name"/>
        <form:label path="age">Age : </form:label>
        <form:input path="age"/>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
