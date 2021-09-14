//Write a function for arithmetic operators(+,-,*,/)
package assignment2;

public class Operators1 {

	public static void main(String[] args) {
		int a=10, b=20;
	System.out.println("a=10 and b=20");
		add(a,b);
		substract(b,a);
		multiplication(a,b);
		division(b,a);

	}
	
	static void add(int a, int b) {
		System.out.println("a+b= " + (a+b));
	}
	
	static void substract(int a, int b) {
		System.out.println("a-b= " + (a-b));
	
	}

	static void multiplication(int a, int b) {
		System.out.println("a*b= " + (a*b));
	}
	
	static void division(int a, int b) {
		System.out.println("a/b= " + (a/b));
	}



}
