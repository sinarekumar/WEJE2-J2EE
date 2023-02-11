package com.jspiders.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {
		File file=new File("DemoFile1.txt");
//		try {
//			file.createNewFile();
//			System.out.println("File created successfully");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			if (file.exists()) {
				System.out.println("The file is already existed");
			} else {
				file.createNewFile();
				System.out.println("File Created successfully");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
