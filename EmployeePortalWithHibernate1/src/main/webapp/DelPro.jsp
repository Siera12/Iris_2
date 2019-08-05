<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Product</title>
</head>
<body>
	<div>
	<fieldset>
		<legend>Delete by ID</legend>
		<form action="DeleteProduct">	
			<table>
				<tr>
					<td>Product Id : </td>
					<td>
						<input type="text" name="pid" placeholder="Enter your product id" required/>
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