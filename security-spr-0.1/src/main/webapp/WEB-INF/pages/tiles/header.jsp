<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<h3><spring:message code="label.title"/></h3>

<span style="float: right">
    <a href="${pageContext.request.contextPath}?lang=en">english</a>
    |
    <a href="${pageContext.request.contextPath}?lang=fr">français</a>
</span>
