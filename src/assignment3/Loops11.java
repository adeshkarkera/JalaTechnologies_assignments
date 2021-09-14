//Program to check whether a number is EVEN or ODD using switch
package assignment3;
import java.util.Scanner;
public class Loops11 {

	public static void main(String[] args) {
		int n;
		Scanner in= new Scanner(System.in);
		System.out .println("Please enter a number: ");
		n= in.nextInt();
		switch(n%2) {
		case 0: System.out. println("Entered number is an even number");
		break;
		case 1: System.out.println("Entered number is an odd number");
		break;
		default: System.out.println("Please enter a valid value");
		}
		in.close();
	}

}
