//Use Interface instances to call the implemented method in the implemented class
package assignment10;

interface InterfaceEg3{
	void eat();
}
public class Interfaces3 implements InterfaceEg3{
	
	public void eat() {
		System.out.println("Eating....");
	}

	public static void main(String[] args) {
		InterfaceEg1 ob=new Interfaces1();
		ob.eat();
	}

}