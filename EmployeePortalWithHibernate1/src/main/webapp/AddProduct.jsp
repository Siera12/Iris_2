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
		<legend>Add New Product</legend>
		<form action="AddNewPro">	
			<table>
				
				<tr>
					<td>Product Name : </td>
					<td>
						<input type="text" name="pname" placeholder="Enter Product Name" required/>
					</td>
				</tr>
				<tr>
					<td>Price : </td>
					<td>
						<input type="number" name="price" placeholder="Enter price" required/>
					</td>
				</tr>
				<tr>
					<td>Quantity : </td>
					<td>
						<input type="text" name="quat" placeholder="Enter quantity" required/>
					</td>
				</tr>
				<tr>
					<td>Description : </td>
					<td>
						<input type="text" name="desc" placeholder="Enter Description." required/>
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