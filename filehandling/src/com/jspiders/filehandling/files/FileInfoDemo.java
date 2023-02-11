package com.jspiders.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileInfoDemo {

	public static void main(String[] args) {
		File file=new File("DemoFile1.txt");
		try {
			if (file.canRead()) {
				System.out.println("File is readable");
			} else {
				System.out.println("File is not readable");
			}
			if (file.canWrite()) {
				System.out.println("File is writeable");
			} else {
				System.out.println("File is not writeable");
			}
			if (file.canExecute()) {
				System.out.println("File is executable");
			} else {
				System.out.println("File is not executable");
			}
			file.createNewFile();
			System.out.println("File created successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		file.length();

	}

}
