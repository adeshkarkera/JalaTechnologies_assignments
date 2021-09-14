//Create two interfaces with one method each. Implement these two interfaces in oneclass.
package assignment10;
interface A{
	void printHello();
}
interface B{
	void printWorld();
}
public class Interfaces4 implements A,B{
	
	public void printHello() {
		System.out.print("Hello");
	}
	
	public void printWorld() {
		System.out.println(" World!!");
	}
	public static void main(String[] args) {
		Interfaces4 ob= new Interfaces4();
		ob.printHello();
		ob.printWorld();

	}

}
