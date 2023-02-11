package com.jspider.deleteFile;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		File file=new File("Demo1.txt");
		try {
			file.createNewFile();
			System.out.println("File is created successfully...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		file.delete();
		System.out.println("File is deleted successfully");
	}
}
