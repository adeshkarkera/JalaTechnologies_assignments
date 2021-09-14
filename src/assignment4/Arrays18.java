//Write a function to find the missing number of sorted array of 1 to 100
package assignment4;

public class Arrays18 {

	public static void main(String[] args) {
		 int arr[] = { 1, 10, 20, 30, 40,50,60,70,80,90,100 };
	     
		    int n = arr.length;
		     
		    
		    printMissingElements(arr, n);

	}
	static void printMissingElements(int arr[], int n){


                 int diff = arr[0] - 0;

                 for(int i = 0; i < n; i++){

                     if (arr[i] - i != diff)
                       {


                 while (diff < arr[i] - i){
                     System.out.println((i + diff));
                               diff++;
                          }
                       }
                      }
}


}
