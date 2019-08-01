<jsp:include page="Header.jsp"/>

	<h3>Welcome <%=session.getAttribute("userName") %></h3>
	
	<br/>
	<h3>user logged in : ${applicationScope.count}</h3>
	<table>
		<tr>
			<td><a href="ViewEmp">1. View Profile</a></td>
		</tr>
		<tr>
			<td><a href="EmpUpdate.jsp">2. Update Profile</a></td>
		</tr>
		
		<tr>
			<td><a href="pwchange.jsp">3. Change Password</a></td>
		</tr>
		<tr>
			<td><a href="logout">4.Logout</a></td>
		</tr>
		
	</table>
	
</body>
</html>



