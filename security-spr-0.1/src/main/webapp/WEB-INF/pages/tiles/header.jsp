<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h3><spring:message code="label.title"/></h3>
<sec:authorize access="hasRole('ROLE_USER')">
    <p><spring:message code="label.connectedAs"/> <sec:authentication property="principal.username" />
        <br/>
        <a href="<c:url value="/j_spring_security_logout" />"><spring:message code="label.logout"/> </a>
       <%-- ne marche pas <sec:authentication property="principal.id" /> --%>
    </p>
</sec:authorize>

<span style="float: right">
    <a href="${pageContext.request.contextPath}?lang=en"><spring:message code="label.en"/></a>
    |
    <a href="${pageContext.request.contextPath}?lang=fr"><spring:message code="label.fr"/></a>
</span>
