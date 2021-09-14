//Call static methods in instance methods
package assignment5;

public class Static5 {

	public static void main(String[] args) {
		Static5 s1=new Static5();
		s1.instanceMethod();
		

	}
	static void staticMethod() {
		System.out.println("Calling the static method inside the instance method");
	}
	void instanceMethod() {
		staticMethod();//out side the class syntax will be 'classname.method();'.
	}

}
