//Read text from a .txt file using BufferedReader
package assignment15;

import java.io.*;

public class Javaio7 {

	public static void main(String[] args) {

		try {
			
			FileReader std=new FileReader("D:\\Textfile\\hello.txt");
			BufferedReader br=new BufferedReader(std);
			int i=0;
			while((i=br.read())!=-1) {
				
				System.out.print((char)i);
			}
			br.close();
			std.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	

	

	}

}
