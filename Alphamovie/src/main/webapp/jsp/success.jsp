<%-- 
    Document   : success
    Created on : Oct 26, 2014, 8:09:59 PM
    Author     : TRathC
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="seat" items="${seat}" >
            <p><c:out value="${seat}"/></p>
        </c:forEach>
    </body>
</html>
