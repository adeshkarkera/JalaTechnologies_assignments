//Write a program to find the common values between two arrays
package assignment4;

public class Array11 {

	public static void main(String[] args) {
		int a[]= {4,5,6,7,3,2}, b[]= {1,2,3,4,5,6};
		int al=a.length, bl=b.length;
		System.out.println("common values between 2 arrays: ");
		for(int i=0;i<al;i++) {
			for(int j=0;j<bl;j++) {
				if(a[i]==b[j])
					System.out.println(b[j]);
			}
		}
	}

}
