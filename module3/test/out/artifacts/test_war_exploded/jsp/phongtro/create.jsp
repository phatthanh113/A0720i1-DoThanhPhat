<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/1/2021
  Time: 7:27 PM
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
    <form method="post" action="phongtro" class="mt-2">
        <div class="form-group">
            <input class="input--style-1" type="hidden" placeholder="ID" name="id" value="${phongTro.id}" readonly>
        </div>
        <div class="form-group">
            <input class="input--style-1" type="text" placeholder="NAME" name="name" value="${phongTro.name}">
            <c:if test="${message != null}">
                <p class="text-danger">${message}</p>
            </c:if>
        </div>
        <div class="form-group">
            <input class="input--style-1" type="text" placeholder="Phone" name="phone" value="${phongTro.phone}">
            <c:if test="${messagePhone != null}">
                <p class="text-danger">${messagePhone}</p>
            </c:if>
        </div>
        <div class="form-group">
            <input class="input--style-1" type="date" name="date" value="${phongtro.dateOpen}">
            <c:if test="${messageBirthday != null}">
                <p class="text-danger">${messageBirthday}</p>
            </c:if>
        </div>
        <div class="form-row">
            <div class="form-group col-sm-2">
                <select name="idPayment" class="form-control">
                    <c:forEach items="${paymentList}" var="payment">
                        <option value="${payment.id}" selected>${payment.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="form-group">
            <input class="input--style-1" type="text" name="note" value="${phongtro.note}">
            <c:if test="${messageBirthday != null}">
                <p class="text-danger">${messageBirthday}</p>
            </c:if>
        </div>
        </div>
        <div class="col-sm-10">
            <input type="hidden" name="action" value="${action}">
            <button class="btn btn-primary" type="submit">${action}</button>
            <button class="btn btn-primary" type="reset">Reset</button>
            <a class="btn btn-primary" href="customer">Quay lại</a>
        </div>
    </form>
</main>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
