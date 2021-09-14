//Write a function to copy an array to another array
package assignment4;

public class Arrays6 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		System.out.println("The list of elements in the array a[]:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("List of elements in the copied array: ");
		copyArray(a);

	}
	static void copyArray(int b[]) {
		int n=b.length;
		int copy[]=new int[n];
		for(int i=0;i<n;i++) {
			copy[i]=b[i];
			System.out.println(copy[i]);
		}
	}

}
