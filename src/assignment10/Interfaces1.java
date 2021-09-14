//Create an interface with only one method and implement it in a class. Call the method implemented
package assignment10;

interface InterfaceEg1{
	void eat();
}
public class Interfaces1 implements InterfaceEg1{
	
	public void eat() {
		System.out.println("Eating....");
	}

	public static void main(String[] args) {
		InterfaceEg1 ob=new Interfaces1();
		ob.eat();
	}

}
