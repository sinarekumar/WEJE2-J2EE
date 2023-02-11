<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% String id = request.getParameter("id");%>
<% String name = request.getParameter("name");%>
<% String email = request.getParameter("email");%>
<% String mobile = request.getParameter("mobile");%>
<% String username = request.getParameter("username");%>
<% String password = request.getParameter("password");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Student Details</legend>
		<table>

			<tr>
				<td><label>ID :</label></td>
				<td><%=id%></td>
			</tr>

			<tr>
				<td><label>Name :</label></td>
				<td><%=name%></td>
			</tr>

			<tr>
				<td><label> Email : </label></td>
				<td><%=email%></td>
			</tr>

			<tr>
				<td><label> Mobile : </label></td>
				<td><%=mobile%></td>
			</tr>

			<tr>
				<td><label> User name : </label></td>
				<td><%=username%></td>
			</tr>

			<tr>
				<td><label> Password : </label></td>
				<td><%=password%></td>
			</tr>

		</table>
	</fieldset>
</body>
</html>