//Write text to a .txt file using BufferedWriter
package assignment15;

import java.io.*;

public class Javaio8 {

	public static void main(String[] args) {

		try {
			
		FileWriter fout=new FileWriter("D:\\Textfile\\hello.txt");
		BufferedWriter br=new BufferedWriter(fout);
		
		br.write("Hello world!!");
		System.out.println("sucess...");
		br.close();
		fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	
	

	}

}
