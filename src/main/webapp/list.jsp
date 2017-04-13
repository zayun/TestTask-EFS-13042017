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
      <th>#</th>
      <th>Name</th>
      <th>BirthDay</th>
      <th>Height</th>
      <th>Weight</th>
      <th>Sex</th>
    </tr>


    <c:forEach items="${peoples}" var="man">
    <tr>
      <td><a title=<c:out value="${man.getHeight()-averHeight}/${man.getWeight()-averWeight}"></c:out>
                href="/info?id=${man.getNumber()}">${man.getNumber()}</a></td>
      <td><c:out value="${man.getName()}"></c:out></td>
      <td><c:out value="${man.getBirthdate()}"></c:out></td>
      <td><c:out value="${man.getHeight()}"></c:out></td>
      <td><c:out value="${man.getWeight()}"></c:out></td>
      <td>
        <c:if test="${man.isSex()}">
            MALE
        </c:if>

        <c:if test="${!man.isSex()}">
          FEMALE
        </c:if>
    </tr>
    </c:forEach>
  </body>
</html>
