//Write a function to remove a specific element from an array
package assignment4;

import java.util.Scanner;

public class Arrays5 {
	public static void main(String args[]) {
		int a[];
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter the legth of the array: ");
		int n= in.nextInt();
		a=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("Enter the element to be deleted: ");
		int del= in.nextInt();
		deletIt(a,del);
		in.close();
	}
	static void deletIt(int[] b, int n) {
		int len= b.length, flag=0;
		for(int i=0;i<len;i++) {
			if(b[i]==n) {
				for(int j=i;j<len-1;j++) {
				b[j]=b[j+1];
			}
				len--;
				flag++;
		}
		}
		if(flag==0) {
			System.out.println("The entered value does not exsist in the array....");
		}
		else {
			System.out.println(n+" Is deleted...\nList of elements in the array after the deletion: ");
			for(int i=0;i<len;i++) {
				System.out.println(b[i]);
			}
		}
		//System.out.println(len);
	}

}
