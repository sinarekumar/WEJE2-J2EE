package com.jspiders.jdbc.insert;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcInsertDynamic {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static int result;
	private static Properties properties=new Properties();
	private static FileReader fileReader;
	private static String filePath ="E:\\WEJE2-J2EE\\JDBC - Dynamic type\\Resources\\db_info.properties";
	private static String query;
	
	public static void main(String[] args) {
		try {
			fileReader=new FileReader(filePath);
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driverPath"));
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			query="insert into student values(?,?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, 05);
			preparedStatement.setString(2, "Garuda");
			preparedStatement.setString(3, "garuda.kgf@gmail.com");
			preparedStatement.setLong(4, 123456789l);
			
			result=preparedStatement.executeUpdate();
			System.out.println(result+" row(s) affected");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (preparedStatement!=null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
