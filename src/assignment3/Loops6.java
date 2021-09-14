//Write a program to print even number between 10 and 100 using while
package assignment3;

public class Loops6 {

	public static void main(String[] args) {
		int i=0,j=0, n=10, evn[], odd[];
		evn = new int[50];
		odd = new int[50];
		
		while(n<=100) {
			
			if(n%2==0) {
				evn[i]=n;
				i++;
			}
			else {
				odd[j]=n;
				j++;
			}
			 n++;
		}
		System.out.println("The list of even numbers between 10 and 100:" );
		for(int k=0; evn[k]!=0;k++) {
			
			System.out.println(evn[k]);
			
		}
		System.out.println("\nThe list of odd numbers between 10 and 100: ");
		for(int k=0; odd[k]!=0;k++) {
			
			System.out.println(odd[k]);
			
		}

	}

}
