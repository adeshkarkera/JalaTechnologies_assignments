/*Create a class with DEFAULT fields and methods. Access these fields and methods
from any other class in the same package*/
package assignment8;

public class Accessmodifiers2 {

	public static void main(String[] args) {
		B obj=new B();
		obj.printMethod();

	}

}

class B{//class with default access modifiers
	int a=10;
	void printMethod()
	{
		System.out.println("Method of class A...");
	}
}