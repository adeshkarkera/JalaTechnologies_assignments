//Write a program to remove the duplicate elements and return the new array
package assignment4;

public class Array17 {
	public static void main(String args[]) {
		int a[]= {2,3,5,6,4,7,3,5,7,8,9,10};
		System.out.println("List of elements in the array: ");
		  for(int i = 0; i < a.length; i++) {  
			  System.out.println(a[i]);
		  }

		System.out.println("Lis of duplicate elements in the array:");
		findDup(a);

		
	}
	static void findDup(int b[]) {
		int len=b.length;
		  for(int i = 0; i < len; i++) {  
	            for(int j = i + 1; j < len; j++) {  
	                if(b[i] == b[j]) {
	                	System.out.println(b[j]);
	                	for(int k=j;k<len-1; k++) {
	                    b[k]=b[k+1];  
	                	}
	                    len--;
	                } 
	            }
		  }
		  System.out.println("List of ellements in the the array after removing the duplicates: ");
		  for(int i=0; i<len;i++){
			  System.out.println(b[i]);
			  
		  }
	}

	

}
