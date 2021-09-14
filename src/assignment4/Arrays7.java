//Write a function to insert an element at a specific position in the array
package assignment4;

import java.util.Scanner;

public class Arrays7 {

	public static void main(String[] args) {
		int a[];
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter the legth of the array: ");
		int n= in.nextInt();
		a=new int[10];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
        System.out.println("Enter the index value where you want to insert the element: ");
        int ind=in.nextInt();
        if(ind>n) {
			System.out.println("Please enter a valid index value.....");
		}
        else {
        System.out.println("Enter the element you want to insert: ");
        int ele=in.nextInt();
        insertAt(a,ind,ele,n);
        }
        in.close();
	}
	
	static void insertAt(int b[], int ind,int e,int n) {
		int len=n;
		 if(ind<=len) {
			++len;
			for(int i=len-1;i>ind;i--) {
				b[i]=b[i-1];
				
			}
		b[ind]=e;
		System.out.println("The list of element after the insertion: ");
		for(int i=0;i<len;i++)
			System.out.println(b[i]);
	}
	}
}
