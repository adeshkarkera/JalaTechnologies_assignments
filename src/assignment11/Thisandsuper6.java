//Use this() and super() in methods not in constructors
package assignment11;

public class Thisandsuper6 extends Thisandsuper6_1{
	void eat() {
		System.out.println("Eating bread.....");
	
	}
	void thisAndSuper() {
		super.eat();//invoking method of the super class
		this.eat();//Invoking method of the sub class
	}
	
	public static void main(String[] args) {
		Thisandsuper6 obj=new Thisandsuper6();
		obj.thisAndSuper();

	}

}

class Thisandsuper6_1{
	void eat() {
		System.out.println("Eating.....");
	}
	
}