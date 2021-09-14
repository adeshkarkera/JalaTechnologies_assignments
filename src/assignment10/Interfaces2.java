/*Create an interface with two methods, but implement only one in a class. Call the
method implemented*/
package assignment10;
interface InterfaceEg2{
	void eat();
	void run();
}   

public class Interfaces2 implements InterfaceEg2{
	
	public void run() {
		System.out.println("Running...");
	}

	public static void main(String[] args) {
		Interfaces2 ob=new Interfaces2();
		ob.run();// throw the error at line 9, it's asks to implement the inherited method.Program will be excuted even after recieving the error
	}

	@Override
	public void eat() {
		
	}

	
}
