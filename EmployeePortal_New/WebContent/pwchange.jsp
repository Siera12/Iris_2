<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change your password</title>
</head>
<body>
<jsp:include page="Header.jsp"/>

	<fieldset>
		<legend>Change your Password</legend>
		<form action="PW" method="post">	
			<table>
			<tr>
					<td>Enter ID : </td>
					<td>
						<input type="number" name="empid" placeholder="Enter old password" required/>
					</td>
				</tr>
				<tr>
					<td>Enter old password : </td>
					<td>
						<input type="password" name="empop" placeholder="Enter old password" required/>
					</td>
				</tr>
				<tr>
					<td>Enter new password : </td>
					<td>
						<input type="password" name="empnp" placeholder="Enter new password" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Submit"/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	</div>
</body>
</html>