//Write a program to print largest number among three numbers.
package assignment3;

import java.util.Scanner;

public class Loops5 {

	public static void main(String[] args) {
	      char c;
		Scanner in= new Scanner(System.in);
		do {
			System.out.println("Please enter 3 numbers:");
			System.out.println("1st number: ");
			int a=in.nextInt();
			System.out.println("2nd number: ");
			int b= in.nextInt();
			System.out.println("3rd number: ");
			int d= in.nextInt();
			if(a>b&&a>d) {
				System.out.println(a +" Is the largest number among entered numbers");
			}
			else if(b>d){
				System.out.println(b +"  Is the largest number among entered numbers");
			}
			else {
				System.out.println(d +"  Is the largest number among entered numbers");

			}
			if(a<b&&a<d) {
				System.out.println(a +" Is the smallest number among entered numbers");
			}
			else if(b>d){
				System.out.println(d +"  Is the smallest number among entered numbers");
			}
			else {
				System.out.println(b +"  Is the smallest number among entered numbers");

			}
			System.out.println("\nDo you wish to continue(Y/N)");
			 c= in.next().charAt(0);
		}while(c=='Y'||c=='y');
		
		in.close();

	}

}
