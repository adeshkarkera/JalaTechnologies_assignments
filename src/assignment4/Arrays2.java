//Write a function to calculate the average value of an array of integers
package assignment4;

public class Arrays2 {

	public static void main(String[] args) {
		int a[]= {4,6,7,8,2,3,};
		avgValue(a);

	}
	
	static void avgValue(int b[]) {
		int sum=0;
		System.out.println("List of values in the array: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
			sum+=b[i];
			
		}
		System.out.println("The average value of an array of integers:"+ (sum/b.length));
	}

}
