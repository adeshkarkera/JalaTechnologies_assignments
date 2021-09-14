//Call instance methods in static methods
package assignment5;

public class Static4 {

	public static void main(String[] args) {
		staticMethod();

	}
	
	void instanceMethod() {
		System.out.println("Calling instance method inside the static method");
	}
	
	static void staticMethod() {
		Static4 s1= new Static4();
		s1.instanceMethod();
		
	}

}
