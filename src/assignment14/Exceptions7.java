//Write a program with finally block
package assignment14;

public class Exceptions7 {

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
		finally {
			System.out.println("This block is executed regardless of the exception" );
		}
	

	}

}
