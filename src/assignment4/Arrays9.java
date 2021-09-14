//Write a function to reverse an array of integer values
package assignment4;

import java.util.Scanner;

public class Arrays9 {

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
			revArray(a);
			in.close();
	}
		static void revArray(int b[]) {
			int n =b.length;
			int rev[]= new int[n];
			for(int i=0;i<b.length;i++) {
				rev[i]=b[n-1];
				n--;
				
			}
			System.out.println("reversed array:");
			for(int i=0;i<b.length;i++) {
				System.out.println(rev[i]);
			}
		}
}
