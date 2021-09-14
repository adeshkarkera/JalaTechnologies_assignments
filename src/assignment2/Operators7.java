//Print the smaller and larger number
package assignment2;

public class Operators7 {

	public static void main(String[] args) {
		int a=14, b=15, c=7;
		
		if (a>b&&a>c) {
			System.out.println("The largest number among 3 is a: "+a);
		}
		else if(b>c) {
			System.out.println("The largest number among 3 is b: "+ b);
		}
		else {
			System.out.println("The largest among 3 numbers is c: "+c);
		}
		if (a<b&&a<c) {
			System.out.println("The smallest number among 3 is a: "+a);
		}
		else if(b<c) {
			System.out.println("The smallest number among 3 is b: "+ b);
		}
		else {
			System.out.println("The smallest among 3 numbers is c: "+c);
		}
	}

}
