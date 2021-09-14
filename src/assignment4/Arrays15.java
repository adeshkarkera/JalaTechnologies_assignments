//Write a function to get the difference of largest and smallest value
package assignment4;

public class Arrays15 {

	public static void main(String[] args) {
		 int len;
	      int a[] = {10, 20, 25, 63, 96, 57};
	      len = a.length;

	     difference(a,len);
	}
	static void difference(int arr[], int len) {
		int temp;
		 for(int i = 0; i<len; i++ ){
	         for(int j = i+1; j<len; j++){

	            if(arr[i]>arr[j]){
	               temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
	      System.out.println("The difference between largest and smallest number in the array: "+(arr[len-1]-arr[0]));

	}

}
