<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/4/2021
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register New Customer</title>
</head>
<body>
<form action="add_customer" method="post" enctype="multipart/form-data">
    <table>
        <tr>
            <td>Tên:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Ngày sinh:</td>
            <td><input type="text" name="date"></td>
        </tr>
        <tr>
            <td>Địa chỉ:</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td>Ảnh:</td>
            <td><input type="file" name="image"></td>
        </tr>
    </table>
    <input type="submit" value="Register"/>
</form>
</body>
</html>
