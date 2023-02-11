//# CharacterStream :
//- In case of character stream data, the content or data is written to the file in 
//  form of character only and also read operation is done in the form of characters only.
//- The fileReader class and Scanner class are used to read the data from the file.
//- The file writer class is used to write the data inside the file.
//
//==> CharacterStream ==> - read - Reader Classes.
//                        - write - writer classes.



package com.jspiders.filehandling.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharactorStreamFile {

	public static void main(String[] args) {
		File file=new File("CharacterStream.txt");
		try {
			if (file.exists()) {
				System.out.println("File is existed");
			} else {
				file.setReadable(true);
				file.setWritable(true);
				file.createNewFile();
				System.out.println("File created successfully");
			}
			
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("This is the data sent to the file");
			System.out.println("Content is return successfully");
			fileWriter.close();
			
			FileReader fileReader=new FileReader(file);
			System.out.println(fileReader.read());
			System.out.println("File reader successfully");
			fileReader.close();
			
			Scanner scanner=new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.hasNextLine());
				scanner.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
