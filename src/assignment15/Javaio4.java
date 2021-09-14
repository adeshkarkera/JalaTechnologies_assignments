//Write text to a .txt file using BufferedOutputStream
package assignment15;

import java.io.*;

public class Javaio4 {

	public static void main(String[] args) {
		try {
			
		FileOutputStream fout=new FileOutputStream("D:\\Textfile\\hello.txt");
		BufferedOutputStream bout= new BufferedOutputStream(fout);
		String s= "Hello world";
		byte[] b= s.getBytes();
		
		bout.write(b);
		System.out.println("sucess...");
		bout.close();
		bout.flush();
		fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	

	}

}
