<jsp:include page="Header.jsp"/>

	<h3>Welcome <%=session.getAttribute("userName") %></h3>
	
	<br/>
	
	<table>
		<tr>
			<td><a href="register.jsp">1. Register a New Employee</a></td>
		</tr>
		<tr>
			<td><a href="viewAllEmployees">2. View All Employees</a></td>
		</tr>
		<tr>
			<td><a href="Update.jsp">3. Update Employee Detail</a></td>
		</tr>
		<tr>
			<td><a href="Search.jsp">4. Search Employee By Id</a></td>
		</tr>
		<tr>
			<td><a href="pwchange.jsp">5. Change your Password</a></td>
		</tr>
	</table>
	
</body>
</html>



