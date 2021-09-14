//Write a program to read text from .txt file using InputStream
package assignment15;
import java.io.FileInputStream;
public class Javaio1 {

	public static void main(String[] args) {
		try {
			
			FileInputStream std=new FileInputStream("D:\\Textfile\\hello.txt");
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
