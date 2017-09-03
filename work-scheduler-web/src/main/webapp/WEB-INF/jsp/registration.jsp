<%--
  Created by IntelliJ IDEA.
  User: Zeller
  Date: 2017. 08. 31.
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form method="post" action="${pageContext.request.contextPath}/registration">
            <label for="personal-name">Employee name:</label>
            <input type="text" name="name" id="personal-name"/>

            <label for="personal-date">Personal date:</label>
            <input type="date" name="date" id="personal-date"/>

            <label for="personal-id">Personal ID:</label>
            <input type="text" name="ID" id="personal-id">

            <label for="medical-care">Medical care:</label>
            <input type="text" name="medical-care" id="medical-care">

            <label for="personal-mail">Personal mail:</label>
            <input type="email" name="mail" id="personal-mail">

            <button type="submit">Register</button>
        </form>
    </body>
</html>
