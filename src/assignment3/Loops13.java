//Program for multiple if else statement(Largest number in 10,20 and 30)
package assignment3;

public class Loops13 {

	public static void main(String[] args) {

		int a=10, b=20, c=30;
		
		if (a>b&&a>c) {
			System.out.println("The largest number among 3 is a: "+a);
		}
		else if(b>c) {
			System.out.println("The largest number among 3 is b: "+ b);
		}
		else {
			System.out.println("The largest among 3 numbers is c: "+c);
		}
		
	}

}
