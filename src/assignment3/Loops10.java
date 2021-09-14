//Write a program to palindrome or not.
package assignment3;
import java.util.Scanner;
public class Loops10 {

	public static void main(String[] args) {
		int num, temp, rev=0, rem;
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter a number: ");
		num= in.nextInt();
		temp=num;
		while(temp>0) {
			
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		if(rev==num) {
			System.out.println("The entered number is a palindrome" );
		}
		else {
			System.out.println("The entered number is not a palindrome" );
			
		}
		in.close();
	}

}
