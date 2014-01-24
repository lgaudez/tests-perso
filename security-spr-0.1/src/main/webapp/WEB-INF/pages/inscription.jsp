<%--
  Created by IntelliJ IDEA.
  User: leoG
  Date: 24/01/14
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Inscription</title>
</head>
<body>

<form:form method="POST" modelAttribute="user">
    <c:if test="${not empty message}"><div class="message green">${message}</div></c:if>
    <table>
        <tr>
            <td><form:label path="login">login</form:label></td>
            <td><form:input path="login" /></td>
        </tr>
        <tr>
            <td><form:label path="password">password</form:label></td>
            <td><form:input path="password" /></td>
        </tr>
        <tr>
            <td><form:label path="firstName">prénom</form:label></td>
            <td><form:input path="firstName" /></td>
        </tr>
        <tr>
            <td><form:label path="lastName">nom</form:label></td>
            <td><form:input path="lastName" /></td>
        </tr>
        <tr>
            <td><form:label path="mail">e-mail</form:label></td>
            <td><form:input path="mail" /></td>
        </tr>
        <tr>
            <td><form:label path="dateOfBirth">date de naissance (jj/mm/aaaa)</form:label></td>
            <td><form:input path="dateOfBirth" /></td>
        </tr>
        <tr>
            <td><form:label path="citizenShip">Nationalité</form:label></td>
            <td><form:input path="citizenShip" /></td>
        </tr>
        <tr>
            <td><form:label path="spokenLanguages">Langauges parlés</form:label></td>
            <td><form:input path="spokenLanguages" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Valider"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>

