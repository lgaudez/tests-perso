
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<p>
    <sec:authorize access="hasRole('ROLE_ADMIN')">
        <a href="${pageContext.request.contextPath}/admin/administration">admin</a><br/>
    </sec:authorize>
    <sec:authorize access="hasRole('ROLE_USER')">
        <a href="${pageContext.request.contextPath}/user/info.html"><spring:message code="label.info"/></a><br/>
        <a href="${pageContext.request.contextPath}/connected.html"><spring:message code="label.home"/></a>
    </sec:authorize>
      <sec:authorize access="isAnonymous()">
        <a href="${pageContext.request.contextPath}/"><spring:message code="label.home"/></a><br/>
    </sec:authorize>
    <br/>
<a href="${pageContext.request.contextPath}/"></a><br/></p>