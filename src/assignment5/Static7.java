//Call static methods and instance methods in main method
package assignment5;

public class Static7 {

	public static void main(String[] args) {
		Static7 s1= new Static7();
		staticMethod();
		s1.instanceMethod();
		

	}
	static void staticMethod() {
		System.out.println("Called static method");
	}
	void instanceMethod() {
		System.out.println("Called instance method");
	}

}
