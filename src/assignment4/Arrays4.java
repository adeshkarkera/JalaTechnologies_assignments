//Write a function to test if array contains a specific value
package assignment4;

import java.util.Scanner;

public class Arrays4 {

	public static void main(String[] args) {
		int a[];
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter the legth of the array: ");
		int n= in.nextInt();
		a=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("Please enter an element to check if it's in the array: ");
		int ele=in.nextInt();
		isContains(a,ele);
		in.close();
	}
	static void isContains( int b[], int n) {
		int flag=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]==n)
			{
				System.out.println(n+" Is at index: "+i);
				flag++;
				break;
			}
		}
		if (flag==0) {
			System.out.println("The entered value does not exsist in the array....");
		}
	}
}
