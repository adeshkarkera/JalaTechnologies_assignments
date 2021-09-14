//Write a method to find number of even number and odd numbers in an array
package assignment4;

public class Arrays14 {

	public static void main(String[] args) {
		int a[]= {10,34,57,34,18,8,55,88};
		System.out.println("The list of elements in the array: ");
		findOddEven(a);

	}
	static void findOddEven(int arr[]) {
		int n= arr.length,k=0;
		int odd[]=new int[n];
		System.out.println("List of even numbers in the array: ");
		for(int i=0;i<n;i++){
		if(arr[i]%2==0) {
			System.out.println(arr[i]);
		}
		else {
			
			odd[k]=arr[i];
			k++;
		}
		}
		System.out.println("List of odd numbers in the array: ");
		for(int i=0;i<k;i++) {
			System.out.println(odd[i]);
			
		}
	}
	

}
