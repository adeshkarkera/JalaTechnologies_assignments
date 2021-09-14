//Write a program to read text from .txt file using FileReader
package assignment15;

import java.io.*;

public class Javaio5 {

	public static void main(String[] args) {

		try {
			
			FileReader std=new FileReader("D:\\Textfile\\hello.txt");
			int i=0;
			while((i=std.read())!=-1) {
				
				System.out.print((char)i);
			}
			std.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	

	}

}
