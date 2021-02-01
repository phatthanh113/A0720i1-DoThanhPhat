<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/29/2021
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
    <jsp:include page="../homepage/homepage.jsp" />
        <main class="container">
            <form method="post" action="customer" class="mt-2">
                <div class="form-group">
                    <input class="input--style-1" type="text" placeholder="ID" name="id" value="${customer.id}" readonly>
                </div>
                <div class="form-group">
                    <input class="input--style-1" type="text" placeholder="NAME" name="name" value="${customer.name}">
                </div>
                <div class="form-row">
                     <div class="form-group col-sm-2">
                        <select name="idProduct" class="form-control">
                            <c:forEach items="${productList}" var="product">
                                <option value="${product.id}">${product.name}</option>
                            </c:forEach>
                        </select>
                     </div>
<%--                    <div class="form-group col-sm-10">--%>
<%--                        <input class="input--style-1" type="hidden" placeholder="NAME" name="hidden">--%>
<%--                    </div>--%>
                </div>
                <div class="form-group">
                    <input class="input--style-1" type="date" name="birthday" value="${customer.birthday}">
                </div>

                </div>
                <div class="col-sm-10">
                    <input type="hidden" name="action" value="${action}">
                    <button class="btn btn-primary" type="submit">${action}</button>
                </div>
            </form>
        </main>


    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
