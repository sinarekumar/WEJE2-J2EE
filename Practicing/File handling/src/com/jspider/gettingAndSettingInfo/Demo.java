package com.jspider.gettingAndSettingInfo;

import java.io.File;

public class Demo {

	public static void main(String[] args) {
		File file=new File("Demo.txt");
		if(file.canRead()) {
			System.out.println("File is readable");
		}
		else {
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
		file.length();
	}

}
