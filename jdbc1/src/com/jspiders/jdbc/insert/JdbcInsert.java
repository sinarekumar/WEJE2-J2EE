package com.jspiders.jdbc.insert;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcInsert {

		private static Connection connection;
		private static Statement statement;
		private static int result ;
		private static FileReader fileReader;
		private static Properties properties=new Properties();
		
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				fileReader=new FileReader("E:\\WEJE2-J2EE\\jdbc1\\resources\\db_info.properties");
				properties.load(fileReader);
				connection=DriverManager.getConnection("jdbc:mysql:// localhost:3306/mysql", properties);
				statement=connection.createStatement();
				result=statement.executeUpdate("insert into student value(03,'Chaitanya','Chaitanya@gmail.com',652564561)");
				System.out.println(result+" row(s) affected");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if (connection!=null) {
					try {
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (statement!=null) {
					try {
						statement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
			}
			

		}

}


