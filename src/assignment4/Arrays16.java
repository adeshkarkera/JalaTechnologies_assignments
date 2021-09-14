//Write a method to verify if the array contains two specified elements(12,23)
package assignment4;

public class Arrays16 {

	public static void main(String[] args) {
		 int[] a = {14,34,22,12,54,22,23};
		 int n1 = 12, n2 = 23;
		    
			System.out.println("Original Array: "); 
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);
			
			result(a, n1, n2);
		    }	
		  
		   static void result(int[] arr, int n1, int n2) {
		    int f1=0,f2=0;
			   for (int num : arr) {
		     if(num==n1||num==n2)
		     {
		    	 if(num==n1) {
		    		 f1++;
		    	 }
		    	 else {
		    		 f2++;
		    	 }

	         } 
}
			   if(f1>0&&f2>0)
			   {
				   System.out.println("Both of the specified numbers(12,23) are present in the array");
			   }
			   else if(f1>0||f2>0) {
				   System.out.println("One of he specified numbers(12,23) is present in the array");
			   }
			   else {
				   System.out.println("The specified numbers are not present in the array");
			   }
}
}