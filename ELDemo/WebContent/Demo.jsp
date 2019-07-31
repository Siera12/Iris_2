<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Expression language</title>
</head>
<body>
			
			<c:set var="zx" value="Overwatch , Genji" scope="page"/>
			<c:set var="zx1" value="Genji" scope="page"/>
			
			Name : ${pageScope.zx1}<br/>
			Designation : ${applicationScope.designation}<br/>
			Employer : ${sessionScope.employerName}	<br/>	
			Specialization : ${pageScope.zx}	<br/>
			
			Textfield's Data : ${param.t1}
			
			<c:forEach begin="0" end="3" var="i">
				${paramValues.qualification[i]}
			
			</c:forEach>c:forEach>
			
			Header INfo:
			
			<hr/>
			
			Host: ${header.host}<br/>
			Accept:${header.accept }
			
			<br/>
			
			Cookie : ${cookie.biscuit.value}
			
			<br/>
			
			
			method of method:
			
			<%= request.getMethod() %>
			
			${pageContext.request.method}
			
</body>
</html>