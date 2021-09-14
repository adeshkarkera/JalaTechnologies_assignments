//Read text from a .txt file using BufferedInputStream
package assignment15;

import java.io.*;

public class Javaio3 {

	public static void main(String[] args) {

		try {
			
			FileInputStream std=new FileInputStream("D:\\Textfile\\hello.txt");
			BufferedInputStream bin= new BufferedInputStream(std);
			int i=0;
			while((i=bin.read())!=-1) {
				
				System.out.print((char)i);
			}
			std.close();
			bin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	

	}

}
