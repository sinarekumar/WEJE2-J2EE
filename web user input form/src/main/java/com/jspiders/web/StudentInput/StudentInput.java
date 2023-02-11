package com.jspiders.web.StudentInput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/registration")
public class StudentInput extends HttpServlet {
	private static Connection connection;
	private static PreparedStatement prepareStatement;
	private static Properties properties= new Properties();
	private static FileReader fileReader;
	private static int result;
	private static String filepath="E:\\\\Java Devolopment Info\\\\weje2\\\\web user input form\\\\resources\\\\db_info.properties ";
	private static String query;
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		try {
			fileReader=new FileReader(filepath);
			properties.load(fileReader);
			Class.forName(properties.getProperty("driverpath"));
			connection=DriverManager.getConnection(properties.getProperty("dburl"), properties);
			query= "insert into student values(?,?,?,?,?,?,?,?)";
			prepareStatement=connection.prepareStatement(query);
			
			String id=request.getParameter("Id");
			String firstname=request.getParameter("FirstName");
			String lastname=request.getParameter("LastName");
			String email=request.getParameter("Email");
			String username=request.getParameter("UserName");
			String password=request.getParameter("Password");
			String mobileno=request.getParameter("MobileNo");
			String dob=request.getParameter("DOB");
			
			prepareStatement.setString(1,id );
			prepareStatement.setString(2,firstname);
			prepareStatement.setString(3, lastname);
			prepareStatement.setString(4,email );
			prepareStatement.setString(5,username );
			prepareStatement.setString(6, password);
			prepareStatement.setString(7,mobileno );
			prepareStatement.setString(8,dob );
			
			result = prepareStatement.executeUpdate();
			
			printWriter.println("<h1>"+ firstname +"'s record has been stored successfully...</h1>");
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(prepareStatement!=null) {
				try {
					prepareStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		PrintWriter writer = response.getWriter();
		writer.println("<h1> record has been submited successfully...</h1>");
		
		doGet(request, response);
	}

}
