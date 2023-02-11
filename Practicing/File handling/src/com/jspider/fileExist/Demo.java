package com.jspider.fileExist;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("Demo.txt");
		try {
			if (file.exists()) {
				System.out.println("File is already exists...please try again");
			} else {
				file.createNewFile();
				System.out.println("File created successfully");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
