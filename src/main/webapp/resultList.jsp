<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 25.01.2021
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.getTitle()}, ${book.getAuthor()}, ${book.getIsbn()}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
