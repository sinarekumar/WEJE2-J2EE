<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student registration</title>
</head>
<body>
	<fieldset>
		<legend>Student Form</legend>
		<form action="./StudentDetails.jsp" method="get">
			<table>
				<tr>
					<td><label>ID :</label></td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td><label>First Name :</label></td>
					<td><input type="text" name="firstname"></td>
				</tr>
				<tr>
					<td><label>Last Name :</label></td>
					<td><input type="text" name="lastname"></td>
				</tr>
				<tr>
					<td><label>Email :</label></td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td><label>User name :</label></td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td><label>Password :</label></td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><label>Mobile :</label></td>
					<td><input type="text" name="mobile"></td>
				</tr>
				<tr>
					<td><label>DOB :</label></td>
					<td><input type="date" name="dob"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>