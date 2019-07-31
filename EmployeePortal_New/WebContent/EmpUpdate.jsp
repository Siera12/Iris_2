<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Details</title>
</head>
<body>
<jsp:include page="Header.jsp"/>

	<fieldset>
		<legend>Enter Details</legend>
		<form action="EmpUpdateController" method="post">	
			<table>
			<tr>
					<td>Enter ID : </td>
					<td>
						<input type="number" name="empid" placeholder="Enter old password" required/>
					</td>
				</tr>
				
				<tr>
					<td>Enter new role : </td>
					<td>
						<input type="text" name="roln" placeholder="Enter new role" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Update"/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	</div>
</body>
</html>