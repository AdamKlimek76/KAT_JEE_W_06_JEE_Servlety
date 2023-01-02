<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 25.01.2021
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/mvc13" method="post">
    Title:
    <input type="text" name="title">
    Author:
    <input type="text" name="author">
    ISBN:
    <input type="number" name="isbn">

    <input type="submit" value="Wyślij">
</form>
</body>
</html>
