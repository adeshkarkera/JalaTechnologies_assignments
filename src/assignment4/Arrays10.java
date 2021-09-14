//Write a function to find the duplicate values of an array
package assignment4;

public class Arrays10 {

	public static void main(String[] args) {
		int a[]= {2,3,5,6,4,7,3,5,7,8,9,10};
		System.out.println("Lis of duplicate elements in the array:");
		findDup(a);

	}
	static void findDup(int b[]) {
		  for(int i = 0; i < b.length; i++) {  
	            for(int j = i + 1; j < b.length; j++) {  
	                if(b[i] == b[j]) { 
	                    System.out.println(b[j]);  
	                }
	            }
		  }
	}
}
	
