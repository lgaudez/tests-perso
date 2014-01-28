<%--
  User: leoG
  Date: 24/01/14
  Time: 16:53
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form:form method="POST" modelAttribute="user">
    <c:if test="${not empty message}">
        <div class="green"> ${message} <spring:message code="label.hasBeenSaved"/>
            <p> <a href="${pageContext.request.contextPath}/connected.html"><spring:message code="label.home"/></a> </p>
        </div>
    </c:if>

    <table>
        <tr>
            <td><form:label path="login"><spring:message code="label.login"/></form:label></td>
            <td><form:input path="login" /></td>
            <td><form:errors  path="login" class="error"/></td>
        </tr>
        <tr>
            <td><form:label path="password"><spring:message code="label.password"/></form:label></td>
            <td><form:input path="password" /></td>
            <td><form:errors  path="password" class="error"/></td>
        </tr>
        <tr>
            <td><form:label path="firstName"><spring:message code="label.firstname"/></form:label></td>
            <td><form:input path="firstName" /></td>
            <td><form:errors  path="firstName" class="error"/></td>
        </tr>
        <tr>
            <td><form:label path="lastName"><spring:message code="label.lastname"/></form:label></td>
            <td><form:input path="lastName" /></td>
            <td><form:errors  path="lastName" class="error"/></td>
        </tr>
        <tr>
            <td><form:label path="mail"><spring:message code="label.email"/></form:label></td>
            <td><form:input path="mail" /></td>
            <td><form:errors  path="mail" class="error"/></td>
        </tr>
        <tr>
            <td><form:label path="dateOfBirth"><spring:message code="label.dateofbirth"/></form:label></td>
            <td><form:input path="dateOfBirth" /></td>
            <td><form:errors  path="dateOfBirth" class="error"/></td>
        </tr>
        <tr>
            <td><form:label path="citizenShip"><spring:message code="label.citizenship"/></form:label></td>
            <td><form:input path="citizenShip" /></td>
            <td><form:errors  path="citizenShip" class="error"/></td>
        </tr>
        <tr>
            <td><form:label path="spokenLanguages"><spring:message code="label.spokenlanguages"/></form:label></td>
            <td><form:input path="spokenLanguages" /></td>
            <td><form:errors  path="spokenLanguages" class="error"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="<spring:message code="label.submit"/>"/>
            </td>
        </tr>
    </table>
</form:form>

