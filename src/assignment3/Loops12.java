//Print gender (Male/Female) program according to given M/F using switch
package assignment3;
import java.util.Scanner;
public class Loops12 {

	public static void main(String[] args) {
		char gender;
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your gender(M/F): ");
		gender=in.next().charAt(0);
		
		switch(gender) {
		
		case 'M': System.out.println("Male");
		break;
		case 'm': System.out.println("Male");
		break;
		case 'F': System.out.println("Female");
		break;
		case 'f': System.out.println("Female");
		break;
		default: System.out.println("Please enter valid value");
		}
in.close();
	}

}
