<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 25.01.2021
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${not empty param.a}">
        a=${param.a}
    </c:when>
    <c:otherwise>
        Parametr "a" nie istnieje
    </c:otherwise>
</c:choose>

</body>
</html>
