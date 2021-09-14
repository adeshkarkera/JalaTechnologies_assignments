//Write a program to read data from properties file.
package assignment15;
import java.io.*;
import java.util.Properties;

public class Javaio9 {

	public static void main(String[] args) {
		try {
			FileReader fr= new FileReader("C:\\Users\\AK\\eclipse-workspace\\JALA_Technologies_Assignments\\src\\assignment15\\config.properties");
			Properties P=new Properties();
			P.load(fr);
			System.out.println(P.getProperty("user"));
			System.out.println(P.getProperty("password"));
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
