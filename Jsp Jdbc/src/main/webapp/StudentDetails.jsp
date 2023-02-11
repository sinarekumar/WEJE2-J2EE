<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
%>
<%
String firstname = request.getParameter("firstname");
%>
<%
String lastname = request.getParameter("lastname");
%>
<%
String email = request.getParameter("email");
%>
<%
String username = request.getParameter("username");
%>
<%
String password = request.getParameter("password");
%>
<%
String mobile = request.getParameter("mobile");
%>
<%
String dob = request.getParameter("dob");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String Driverpath = "com.mysql.cj.jdbc.Driver";
   String dburl="jdbc:mysql://localhost:3306/weje2"; 
   String userName="root";
   String passWord="root";
   String query;%>
   
<% try{
	Class.forName("Driverpath");
	Connection connection=DriverManager.getConnection("dburl");
	query="insert into student values(?,?,?,?,?,?,?,?)";
	PreparedStatement prepareStatement= connection.prepareStatement(query);
	prepareStatement.setArray(1,id);
	%>


	<fieldset>
		<legend>Student Details</legend>
		<table>

			<tr>
				<td><label>ID :</label></td>
				<td><%=id%></td>
			</tr>

			<tr>
				<td><label>Name :</label></td>
				<td><%=firstname%></td>
			</tr>
			<tr>
				<td><label>Last Name :</label></td>
				<td><%=lastname%></td>
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