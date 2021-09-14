/*Create two interfaces with the same method (same signature) in both the interfaces.
Implement these two interfaces in one class. Call the method.*/
package assignment10;

interface InterfacesEg5_1 {
	void printGreeting();
}
interface InterfacesEg5_2{
	void printGreeting();
}
public class Interfaces5 implements InterfacesEg5_1,InterfacesEg5_2{
	public void printGreeting() {
		System.out.println("Hello World!!");//implementing the common method.
	}

	public static void main(String[] args) {
		Interfaces5 ob= new Interfaces5();
		ob.printGreeting();
		InterfacesEg5_1 ob1=new Interfaces5();
		ob1.printGreeting();

		InterfacesEg5_2 ob2=new Interfaces5();
		ob2.printGreeting();


	}

}
