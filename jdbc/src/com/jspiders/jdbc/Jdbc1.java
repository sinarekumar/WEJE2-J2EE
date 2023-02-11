package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {

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
				ResultSet resultSet=statement.executeQuery("Select * from student");
//			step 4 : Process the result.	
				while(resultSet.next()) {
					System.out.println(resultSet.getString(1)+" || "+resultSet.getString(2)+" || "+resultSet.getString(3)+" || "+resultSet.getString(4));
				}
//			Step 5 : Close the connection.
				connection.close();
				statement.close();
				resultSet.close();
				
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
