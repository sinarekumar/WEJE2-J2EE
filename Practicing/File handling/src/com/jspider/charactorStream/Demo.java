//Character stream : In character stream we can read and write the data in the form of character only.
//                   FileWriter class is used for write operation only.
//                   FileWriter and scanner class is used for character read operation.
//                   It can work on 16-bit character

package com.jspider.charactorStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		File file=new File("Demo2.txt");
		if (file.exists()) {
			System.out.println("File is already Present");
		} else {
			try {
				file.setReadable(true);
				file.setWritable(true);
				file.createNewFile();
				System.out.println("file is created successfully...");
				
				FileWriter fileWriter=new FileWriter(file);
				fileWriter.write("Hello World");
				System.out.println("content is writen inside the file...");
				fileWriter.close();
				
				FileReader fileReader=new FileReader(file);
				System.out.println("Writen content is "+fileReader.read());
				System.out.println("file is successfully Readable...");
				fileReader.close();
				
				Scanner scanner=new Scanner(System.in);
				scanner.hasNextLine();
				System.out.println(scanner.hasNext());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
