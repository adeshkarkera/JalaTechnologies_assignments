//Program to equal operator and not equal operators
package assignment3;
import java.util.Scanner;

public class Loops3 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
     System.out.println("PLeasse enter the legnth of the array:");
     int n= sc.nextInt();
     int a[]=new int[10];
     System.out.println("Please enter the numbers into array:");
     for(int i=0;i<n;i++) {
    	 a[i]=sc.nextInt();//equal operators
     }
     System.out.println("List of odd numbers in the array:");
     for(int i=0;i<n;i++) {
    	 if( a[i]%2!=0) {//not equal operator
    	 System.out.println(a[i]);
    	 }
     }
     sc.close();
	}

}
