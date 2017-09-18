<%--
  Created by IntelliJ IDEA.
  User: Zeller
  Date: 2017. 08. 31.
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page   contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <title>Registration</title>
        <link href="${pageContext.request.contextPath}/resources/css/header.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css?family=Oswald:300,400,700" rel="stylesheet"/>
    </head>
    <body>
        <header>
            <p id="header-title"><b>WORK</b> SCHEDULER</p>
        </header>
        <main>
            <form:form modelAttribute="employee" action="${pageContext.request.contextPath}/registration">
                <div>
                    <form:label path="name">Name: </form:label>
                    <form:input required="required" path="name"/>
                </div>

                <div>
                    <form:label path="birthday">Birthday: </form:label>
                    <form:input required="required" path="birthday" type="date"/>
                </div>

                <div>
                    <form:label path="email">Mail: </form:label>
                    <form:input required="required" path="email"/>
                </div>
                <div>
                    <form:label path="personalID">Personal ID: </form:label>
                    <form:input required="required" path="personalID"/>
                </div>
                <div>
                    <form:label path="medicalCare">Medical care: </form:label>
                    <form:input required="required" path="medicalCare"/>
                </div>

                <form:button>Submit</form:button>

            </form:form>
        </main>
    </body>
</html>
