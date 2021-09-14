//Write a program to print the odd and even numbers.
package assignment3;
import java.util.Scanner;
public class Loops4 {

	public static void main(String[] args) {
		int a; char c;
		Scanner in= new Scanner(System.in);
		do {
			System.out.println("Please enter a number:");
			a=in.nextInt();
			if(a%2==0) {
				System.out.println(a +" Is an even number");
			}
			else {
				System.out.println(a +" Is an odd number");
			}
			System.out.println("\nDo you wish to continue(Y/N)");
			 c= in.next().charAt(0);
		}while(c=='Y'||c=='y');
		
		in.close();

	}

}
