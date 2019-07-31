<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<jsp:include page="Header.jsp"/>

	<fieldset>
		<legend>Register New Employee</legend>
		<form action="Reg">	
			<table>
				
				<tr>
					<td>Employee Name : </td>
					<td>
						<input type="text" name="empn" placeholder="Enter name" required/>
					</td>
				</tr>
				<tr>
					<td>Gender : </td>
					<td>
						<input type="text" name="gen" placeholder="Enter gender" required/>
					</td>
				</tr>
				<tr>
					<td>Qualification : </td>
					<td>
						<input type="text" name="qual" placeholder="Enter qualification" required/>
					</td>
				</tr>
				<tr>
					<td>Contact No.: </td>
					<td>
						<input type="text" name="con" placeholder="Enter contact no." required/>
					</td>
				</tr>
				<tr>
					<td>Email : </td>
					<td>
						<input type="text" name="em" placeholder="Enter email" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Register"/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	</div>
</body>
</html>