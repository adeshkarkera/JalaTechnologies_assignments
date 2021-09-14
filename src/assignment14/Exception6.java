//Write a program to create your own exception
package assignment14;

class InvalidAgeException extends Exception{
	 public InvalidAgeException(String s){
		super(s);
	}
}
public class Exception6 {
	public static void validate(int a) throws InvalidAgeException{
		if(a<18) {
			throw new InvalidAgeException("Not eligible to vote");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String[] args) {
		
		try {
			validate(17);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}

	}

}
