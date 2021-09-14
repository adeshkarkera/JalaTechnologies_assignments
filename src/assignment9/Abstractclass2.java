/*Create a sub class for an abstract class. Create an object in the child class for the
abstract class and access the non-abstract methods*/
package assignment9;

abstract class AbstractEg2{
	abstract void run();
	void eat() {
		System.out.println(" Eating....");
	}
}


public class Abstractclass2 extends AbstractEg2{
	void run() {
		System.out.println("Running...");
	}

	public static void main(String[] args) {
		
		AbstractEg2 ob=new Abstractclass2();
		ob.eat();// calling non-abstract method
		
			
		}
		

	}


