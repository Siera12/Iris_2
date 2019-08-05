<%@page import="java.util.List,com.iris.models.Product" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="Header.jsp"/>

	
	<table>
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Description</th>
				
		<c:forEach items="${eList}" var="e">
			<tr>
				<td>${e.productId}</td>
				<td>${e.productName}</td>
				<td>${e.price}</td>
				<td>${e.quantity}</td>
				<td>${e.description}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>