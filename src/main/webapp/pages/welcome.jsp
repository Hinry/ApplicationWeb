<%--
  Created by IntelliJ IDEA.
  User: HillelNew8
  Date: 28.11.2016
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

     <h1>${message}</h1>

     <form action="/welcome" method="post">
         <label>Введите имя: </label><input name="name">
         <button type="submit">Ok</button>
</form>
</body>
</html>
