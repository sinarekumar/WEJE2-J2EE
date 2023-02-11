package com.jspider.serializationDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Usermain {

	public static void main(String[] args) {
		User user=new User(1,"Aditya","Aditya123");
		try {
			FileOutputStream fileout=new FileOutputStream("File.txt");
			ObjectOutputStream objectOut= new ObjectOutputStream(fileout);
			objectOut.writeObject(user);
			System.out.println("Object Written");
			objectOut.flush();
			objectOut.close();
			
			FileInputStream fileIn=new FileInputStream("File.txt");
			ObjectInputStream objectIn=new ObjectInputStream(fileIn);
			User readObject=(User) objectIn.readObject();
			System.out.println(readObject);
			objectIn.close();
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
