package com.jspiders.filehandling.files;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) {
		File file=new  File("DeleteFile.txt");
		try {
			file.createNewFile();
			System.out.println("File created successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		file.delete();
		System.out.println("File Deleted successfully");

	}

}
