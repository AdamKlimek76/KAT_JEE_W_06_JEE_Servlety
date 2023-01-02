<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 26.01.2021
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  action="/login" method="post">
    User:
    <input type="text"  name="username"/>
    Password:
    <input name="password" type="password"/>
    <button type="submit">Zaloguj</button>
</form>
${error}
</body>
</html>
