package com.jspiders.serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class UserMain {
	public static void main(String[] args) {
		User user=new User(01, "Kumar" , "Kumar@123");
		try {
			FileOutputStream fileOut=new FileOutputStream("Demo.txt");
			try {
				ObjectOutputStream objOpStream=new ObjectOutputStream(fileOut);
				objOpStream.writeObject(user);
				System.out.println("File is writen");
				objOpStream.flush();
				objOpStream.close();
				
				FileInputStream ipStream=new FileInputStream("Demo.txt");
				ObjectInputStream objIpStream=new ObjectInputStream(ipStream);
//				use type cast operator for downcasting to retrieve child class data.
				try {
					User readObject=(User)objIpStream.readObject();
					System.out.println(readObject);
					objIpStream.close();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
