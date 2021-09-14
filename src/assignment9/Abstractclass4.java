//Create an instance for the child class in child class and call non-abstract methods
package assignment9;

abstract class AbstractEg4{
	abstract void run();
	void eat() {
		System.out.println(" Eating....");
	}
}
public class Abstractclass4 extends AbstractEg4{
	
	void run() {
		System.out.println("Running....");
	}

	public static void main(String[] args) {
		Abstractclass4 ob=new Abstractclass4();
		ob.eat();//calling non-abstract method using sub class instance

	}

}
