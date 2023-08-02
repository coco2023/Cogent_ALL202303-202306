<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<c:set var="string" value="welcome to JSP! "/>  
 <c:if test="${fn:endsWith(String, 'prgramming')}">  
	<p> String ends with Programming </p>
 </c:if>  
  <c:if test="${fn:endsWith(String, 'JSP'}">  
    <p> String ends with JSP </p>  
 </c:if>  


</body>
</html>