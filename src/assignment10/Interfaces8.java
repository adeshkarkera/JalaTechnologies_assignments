/*Create a PUBLIC interface with fields and methods, fields should have values assigned.
Implement this interface to some class and print the values of the interface fields and
call the interface methods*/
package assignment10;

public class Interfaces8 implements Interface8_1{
	public void run() {
		System.out.println("Running");
	}

	public static void main(String[] args) {
		
		Interface8_1 ob=new Interfaces8();
		System.out.println(Interface8_1.a);// Accessing the variable of the inteface 'Interface8_1' form 'Interface8_1.java'.
		ob.run();//Accessing method of the public Interface 'Interface8_1' form 'Interface8_1.java'.

	}

}
