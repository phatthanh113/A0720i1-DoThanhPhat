<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/1/2021
  Time: 7:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add- Title</title>
</head>
<body>
    <h2>Settings</h2>
    <form:form action="/webapp" method="post" modelAttribute="webApp">
        <form:label path="languages">Languages</form:label>
        <form:select path="languages"/><br>
        <form:label path="pageSize">Page Size</form:label>
            <form:select path="pageSize"><br>
                <form:options items="${listPageSize}" />
            </form:select><br>
        <form:label path="spamFilter">Spam Filter</form:label>
        <form:checkbox path="spamFilter" value="enable spams"/><br>
        <form:label path="signature">Signature</form:label>
        <form:textarea path="signature"/><br>
        <input type="submit" value="SUBMIT">
    </form:form>
    <h2>${results}</h2>

</body>
</html>
