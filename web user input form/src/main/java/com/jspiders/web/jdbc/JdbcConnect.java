package com.jspiders.web.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JdbcConnect {
	private static Connection connection;
	private static PreparedStatement prepareStatement;
	private static Properties properties= new Properties();
	private static FileReader fileReader;
	private static String filepath="E:\\\\Java Devolopment Info\\\\weje2\\\\web user input form\\\\resources\\\\db_info.properties ";
	private static String query;
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		String s=scanner.next();
		long l=scanner.nextLong();
		
		try {
			fileReader=new FileReader(filepath);
			properties.load(fileReader);
			Class.forName(properties.getProperty("driverpath"));
			connection=DriverManager.getConnection(properties.getProperty("dburl"), properties);
			query= "insert into student values(?,?,?,?,?,?,?,?)";
			prepareStatement=connection.prepareStatement(query);
			prepareStatement.setInt(1, i);
			prepareStatement.setString(2, s);
			prepareStatement.setString(3, s);
			prepareStatement.setString(4, s);
			prepareStatement.setString(5, s);
			prepareStatement.setString(6, s);
			prepareStatement.setLong(7, l);
			prepareStatement.setInt(8, i);
			prepareStatement.executeUpdate();
			
			
			
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
		

	}

}
