<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<p> String ends with programming</p>
<p> JSP ends with programming</p>

<c:set var = "String" value = "Welcome to - JSP Programming"/>
<c:if test="${fn:endsWith(String, 'Programming')}">  
	<p> String ends with programming</p>
</c:if>  
<c:if test="${fn:endsWith(String, 'JSP')}">  
	<p> JSP ends with programming</p>
</c:if>  

</body>
</html>