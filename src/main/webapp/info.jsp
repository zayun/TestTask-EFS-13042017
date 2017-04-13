<%--
  Created by IntelliJ IDEA.
  User: smoldyrev
  Date: 12.04.17
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LIST</title>
</head>
<body>
<table border="1" width="100%" cellpadding="5">

    <tr>
        <td>#</td>
        <td>${man.getNumber()}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${man.getName()}</td>
    </tr>
    <tr>
        <td>Birthday</td>
        <td>${man.getBirthdate()}</td>
    </tr>
    <tr>
        <td>Height</td>
        <td>${man.getHeight()}</td>
    </tr>
    <tr>
        <td>Weight</td>
        <td>${man.getWeight()}</td>
    </tr>
    <tr>
        <td>sex</td>
        <td><c:if test="${man.isSex()}">
            MALE
        </c:if>

            <c:if test="${!man.isSex()}">
                FEMALE
            </c:if></td>
    </tr>
</body>
</html>
