//Create an interface with private, public and protected fields
package assignment10;
interface interfaceEg10{
	public int a=10;//Allowed access modifier for the variables are public, static and final
	@SuppressWarnings("unused")
	private void run() {
		System.out.println("Running...");
	}
	//protected void eat();( allowed accesses specifiers for methods are public,private,abstract,static and strictfp.
}
public class Interfaces10 implements interfaceEg10{
	

	public static void main(String[] args) {	
	}

}
