<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<title><spring:message code="label.connectionPage"/></title>
<%-- <style>
.error {
	color: red;
}
</style>
</head>
<body> --%>

<div id="login">
    <h1><spring:message code="label.login"/> </h1>

    <p>
        <c:if test="${error == true}">
            <b class="error"><spring:message code="label.errorLogin"/></b>
        </c:if>
    </p>

    <form method="post" action="<c:url value='j_spring_security_check'/>" >
        <table>
            <tbody>
            <tr>
                <td><spring:message code="label.login"/></td>
                <td><input type="text" name="j_username" id="j_username"size="30" maxlength="40"  /></td>
            </tr>
            <tr>
                <td><spring:message code="label.password"/></td>
                <td><input type="password" name="j_password" id="j_password" size="30" maxlength="32" /></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="<spring:message code="label.connect"/>" /></td>
            </tr>
            </tbody>
        </table>
    </form>
</div>
<%-- <p>
<a href="${pageContext.request.contextPath}/index.html">Page d'accueil</a><br/>
</p> --%>