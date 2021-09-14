//Handle the Arithmetic exception using try-catch block
package assignment14;

public class Exceptions2 {
	public static void main(String[] args) {
		try {
		int a=24,b=0;
		System.out.println((a/b));
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}
