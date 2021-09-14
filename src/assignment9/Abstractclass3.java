//Create an instance for the child class in child class and call abstract methods
package assignment9;

abstract class AbstractEg3{
	abstract void run();
	void eat() {
		System.out.println(" Eating....");
	}
}
public class Abstractclass3 extends AbstractEg3{
	void run() {
		System.out.println("Running....");
	}

	public static void main(String[] args) {
		
		Abstractclass3 ob=new Abstractclass3();
		ob.run();//calling abstract method
	}

}
