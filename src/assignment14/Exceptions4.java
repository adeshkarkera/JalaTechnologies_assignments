//Write a program with multiple catch blocks
package assignment14;

public class Exceptions4 {

	public static void main(String[] args) {

		try {
		int a=24,b=0;
		System.out.println((a/b));
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	

}
