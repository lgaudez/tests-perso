<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<p><a href="${pageContext.request.contextPath}/user/info.html"><spring:message code="label.info"/></a><br/>
<a href="${pageContext.request.contextPath}/"><spring:message code="label.home"/></a><br/></p>