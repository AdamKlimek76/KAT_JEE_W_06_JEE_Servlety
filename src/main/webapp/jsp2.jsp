<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 25.01.2021
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="listItem" >
     <c:out value="${listItem}"/>
</c:forEach>
<c:forEach begin="${start}" end="${end}" varStatus="count" >
    <c:out value="${count.index}"/>
</c:forEach>

</body>
</html>
