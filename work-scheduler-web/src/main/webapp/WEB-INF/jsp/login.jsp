<%--
  Created by IntelliJ IDEA.
  User: Zeller
  Date: 2017. 09. 13.
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <title>Login</title>
        <link href="${pageContext.request.contextPath}/resources/css/header.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/resources/css/buttons.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css?family=Oswald:300,400,700" rel="stylesheet"/>
    </head>
    <body>
        <%@include file="../html/header.html"%>

        <div id="form-container">
            <form:form modelAttribute="userLogin" action="${pageContext.request.contextPath}/login">
                <div>
                    <form:label path="username">Username: </form:label>
                    <form:input required="required" path="username"/>
                </div>

                <div>
                    <form:label path="password">Password: </form:label>
                    <form:input required="required" path="password" type="password"/>
                </div>

                <form:button>Login</form:button>
            </form:form>
        </div>
    </body>
</html>
