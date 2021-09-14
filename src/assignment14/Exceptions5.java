package assignment14;

public class Exceptions5 {

	public static void main(String[] args) {
		
		validate(17);

	}

	static void validate(int age) {
		if(age>=18) {
			
			System.out.println("Eligible to vote");
		}
		else {
			throw new ArithmeticException("Not eligible to vote");
		}
	}
	
	
}
