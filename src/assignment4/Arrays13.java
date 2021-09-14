//Write a method to find the second largest number in an array
package assignment4;

public class Arrays13 {

	public static void main(String[] args) {
		 int len;
	      int a[] = {10, 20, 25, 63, 96, 57};
	      len = a.length;

	     secLarge(a,len);
	}
	static void secLarge(int arr[], int len) {
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
	      System.out.println("Third second largest number is: "+arr[len-2]);
	}

	}


