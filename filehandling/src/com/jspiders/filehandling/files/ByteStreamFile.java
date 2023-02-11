//In file handling there are two ways to read and write the files...
//1.Byte Stream :
//2.Character Stream :
//	
//	1.Byte Stream : - Read ==> FileInputStream() [For Input Stream Classes] :
//		- In case of byte stream the date will first come to byte code format and then 
//		it will return to the file.
//	2.Character Stream : - Write ==> FileOutputStream() [For Output Stream Classes]
			

package com.jspiders.filehandling.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamFile {

	public static void main(String[] args) {
		File file=new File("DemoFile2.txt");
		if (file.exists()) {
			System.out.println("File is existed");
		} else {
			try {
				file.setReadable(true);
				file.setWritable(true);
				file.createNewFile();
				
				System.out.println("File created successfully");
				
				FileOutputStream opStream=new FileOutputStream(file);  // Create an object for write Output Stream //
				opStream.write(45);
				System.out.println("Content writen to the file");
				opStream.close();
				
				FileInputStream ipStream=new FileInputStream(file);
				ipStream.read();
				System.out.println("Content read properly in the file");
				ipStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
