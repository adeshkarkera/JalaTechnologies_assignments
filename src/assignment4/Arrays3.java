//Write a program to find the index of an array element
package assignment4;
import java.util.Scanner;
public class Arrays3 {

	public static void main(String[] args) {
		int a[], flag=0, ele;
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter the legth of the array: ");
		int n= in.nextInt();
		a=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("Please enter the element to find it's index:");
			ele=in.nextInt();
			for(int i=0;i<n;i++) {
				if(a[i]==ele) {
					System.out.println("Index  "+ele+" is: "+i);
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println("The entered element does not exsist in the array....");
			}
			in.close();
	}

}
