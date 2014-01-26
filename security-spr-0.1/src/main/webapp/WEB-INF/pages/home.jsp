<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<body>
<h1>Page d'accueil</h1>
<p>
<!-- <a href="${pageContext.request.contextPath}/sec/moderation.html">Moderation page</a><br/> -->
<a href="${pageContext.request.contextPath}/admin/administration.html"><spring:message code="label.admin"/></a><br/>
<a href="${pageContext.request.contextPath}/user/login-form.html"><spring:message code="label.connect"/></a><br/>
<a href="${pageContext.request.contextPath}/user/info.html"><spring:message code="label.info"/></a><br/>
<a href="/inscription.html"><spring:message code="label.register"/></a><br/>
<!-- <a href="${pageContext.request.contextPath}/admin/second.html">Second Admin page</a><br/> -->
</p>
</body>
</html>