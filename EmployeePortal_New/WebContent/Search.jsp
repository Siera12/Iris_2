<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="Header.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
<fieldset>
		<legend>Search by ID</legend>
		<form action="Search">	
			<table>
				<tr>
					<td>Employee Id : </td>
					<td>
						<input type="number" name="empid" placeholder="Enter your id" required/>
					</td>
				
				<tr>
					<td colspan="2">
						<input type="submit" value="Login"/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	</div>
</body>
</html>