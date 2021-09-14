//Create an interface and inherit it from the other interface.
package assignment10;

interface interfaceEg7_1{
	void printHello();
}
interface interfaceEg7_2 extends interfaceEg7_1{
	void printWorld();
}
public class Interfaces7 implements interfaceEg7_2{
	
	public void printHello() {
		System.out.print("Hello");
	}
	
	public void printWorld() {
		System.out.println(" World!!");
	}
	public static void main(String[] args) {
		interfaceEg7_2 ob= new Interfaces7();
		ob.printHello();
		ob.printWorld();

	}

}