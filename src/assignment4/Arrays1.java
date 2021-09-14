//Write a function to add integer values of an array
package assignment4;

public class Arrays1 {

	public static void main(String[] args) {
		int a[]= {2,4,6,8,5,9}, sum=0;
		System.out.println("List of numbers in the array a[]: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			sum+=a[i];
		}
		System.out.println("\n"
				+ "The sum of all values in the array a[]= "+sum );
	}

}
