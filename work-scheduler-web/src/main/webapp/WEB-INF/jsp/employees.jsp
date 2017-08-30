<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="employees" scope="request" type="java.util.Collection" />

<html lang="en">
    <head>
        <title>Work Scheduler</title>
    </head>
    <body>
        <main>
            <h2>Currently registered employees</h2>
            <c:if test="${empty employees}">
                <p>None yet. :(</p>
            </c:if>

            <ul>
                <c:forEach items="${employees}" var="employee">
                    <li>${employee.name}</li>
                    <li>${employee.email}</li>
                    <li>${employee.birthday}</li>
                </c:forEach>
            </ul>
        </main>
    </body>
</html>
