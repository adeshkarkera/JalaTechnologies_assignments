//Try to call the constructor multiple times with the same object
package assignment12;

public class Constructor5 {
	Constructor5(){
		System.out.println("Welcome to Constructor5");
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Constructor5 obj= new Constructor5();//Constructor can be invoked only one time per object creation by using the new keyword.

	}

}
