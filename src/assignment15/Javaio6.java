//Write a program to write text to .txt file using FileWriter
package assignment15;

import java.io.*;

public class Javaio6 {

	public static void main(String[] args) {

		try {
			
		FileWriter fout=new FileWriter("D:\\Textfile\\hello.txt");
		
		fout.write("Hello world!!");
		System.out.println("sucess...");
		fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	
	}

}
