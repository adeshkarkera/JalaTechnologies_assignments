//Write a function to find the minimum and maximum value of an array
package assignment4;

import java.util.Scanner;

public class Arrays8 {

	public static void main(String[] args) {
		int a[];
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter the legth of the array: ");
		int n= in.nextInt();
		a=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
			System.out.println("The maximum number in the array: "+getMaxValue(a));
			System.out.println("The minimum number in the array: "+getMinValue(a));
			in.close();
	}
	public static int getMaxValue(int[] num){
		  int maxValue = num[0];
		  for(int i=1;i < num.length;i++){
		    if(num[i] > maxValue){
		      maxValue = num[i];
		    }
		  }
		  return maxValue;
		}
	
		public static int getMinValue(int[] num){
		  int minValue = num[0];
		  for(int i=1;i<num.length;i++){
		    if(num[i] < minValue){
		      minValue = num[i];
		    }
		  }
		  return minValue;
		}

}
