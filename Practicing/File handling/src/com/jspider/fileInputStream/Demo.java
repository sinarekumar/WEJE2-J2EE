//Byte Stream : for read and write purpose byte stream is used.
//              for write -- fileOutputStream is used.
//              for read -- fileInputStream is used.

package com.jspider.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		File file=new File("Demo1.txt");
		if (file.exists()) {
			System.out.println("File is already present...");
		} else {
			try {
				file.canRead();
				file.canWrite();
				file.createNewFile();
				System.out.println("File is successfully Created...Now you can perform the operation...");
				
				FileOutputStream opStream=new FileOutputStream(file);
				opStream.write(45);
				System.out.println("Content is written inside the file...");
				opStream.close();
				
				FileInputStream ipStream=new FileInputStream(file);
				System.out.println(ipStream.read()+" : This content written inside the file...");
				System.out.println("Now you can run the file...");
				ipStream.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
