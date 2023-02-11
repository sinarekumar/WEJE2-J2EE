package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {

	public static void main(String[] args) {
		try {
//			Step 1 : to load the driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
//			step 2 : Open the connection.	
				Connection connection= DriverManager.getConnection
						("jdbc:mysql:// localhost:3306/mysql? user=root & password=root");
//			Step 3 : Create/prepare the statement.	
				Statement statement=connection.createStatement();
				int resultSet=statement.executeUpdate("insert into student value(03,'Baburao','babu786@gmail.com',213654981)");
//			step 4 : Process the result.	
				System.out.println(resultSet+" rows affected");
//			Step 5 : Close the connection.
				connection.close();
				statement.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
