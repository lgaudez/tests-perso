<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<h3><spring:message code="label.title"/></h3>

<span style="float: right">
    <a href="${pageContext.request.contextPath}?lang=en"><spring:message code="label.en"/></a>
    |
    <a href="${pageContext.request.contextPath}?lang=fr"><spring:message code="label.fr"/></a>
</span>
