//Write a program to find Armstrong number or not
package assignment3;
import java.util.Scanner;
public class Loops8 {

	public static void main(String[] args) {
		int temp, last=0, dig=0, sum=0,num;
		Scanner in=new Scanner(System.in);
		System.out.print("Please enter a number:");
		num=in.nextInt();
		temp=num;
		while(temp>0){
			temp=temp/10;
			dig++;
		}
		temp=num;
		while(temp>0){
			last=temp%10;
			sum+=(Math.pow(last,dig));
			temp=temp/10;
		}
		if(num==sum) {
			System.out.println("The entered number is an Amstrong number");
		}
		else {
			System.out.println("The entered number is not an Amstrong number");

		}
		in.close();
	}

}
