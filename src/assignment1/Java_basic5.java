//Write a function to print your name and call the function from main method
package assignment1;

public class Java_basic5 {
	
static int a= 15;
	public static void main(String[] args) {
		
		printNumber();
		System.out.println(" The value of the global variable a="+ a);

	}
	
	static void printNumber() {
		int a=5;
		System.out.println("The value of the local variable a="+ a);
	}

}
