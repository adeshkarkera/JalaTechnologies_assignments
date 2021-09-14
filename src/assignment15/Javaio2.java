//Write a program to write text to .txt file using OutputStream
package assignment15;
import java.io.FileOutputStream;
public class Javaio2 {

	public static void main(String[] args) {
		try {
			
		FileOutputStream fout=new FileOutputStream("D:\\Textfile\\hello.txt");
		String s= "Hello world";
		byte[] b= s.getBytes();
		
		fout.write(b);
		System.out.println("sucess...");
		fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
