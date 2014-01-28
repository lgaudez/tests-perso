<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<p><spring:message code="label.doYouHaveAccount"/> -> <a href="${pageContext.request.contextPath}/user-login"><spring:message code="label.connect"/></a></p>
<p><spring:message code="label.firstTime"/> -> <a href="/inscription.html"><spring:message code="label.register"/></a></p>
<p>
<!-- <a href="${pageContext.request.contextPath}/sec/moderation.html">Moderation page</a><br/> -->
<!-- <a href="${pageContext.request.contextPath}/admin/administration.html"><spring:message code="label.admin"/></a><br/> -->



<!-- <a href="${pageContext.request.contextPath}/admin/second.html">Second Admin page</a><br/> -->
</p>

