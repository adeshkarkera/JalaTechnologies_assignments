//Write a program to find the prime or not.
package assignment3;
import java.util.Scanner;
public class Loops9 {

	public static void main(String[] args) {
		int num, flag=0;
		Scanner in= new Scanner(System.in);
System.out.println("Please enter a number: ");
		num=in.nextInt();
		int m=num/2;
		if(num==0||num==1){
			System.out.println("The entered number is not a prime number");
		}
		else {
			for(int i=2;i<=m;i++) {
				if(num%i==0) {
					System.out.println("The entered number is not  a prime number");
					flag++;
					break;
				}
				
			}
		}
		if(flag==0) {
			System.out.println("The entered number is a prime number");
		}
		in.close();
	}

}
