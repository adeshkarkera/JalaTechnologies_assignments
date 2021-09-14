/*Create an interface with a default method and implement it in a class. Do not provide
implementation to the default method and call the method.*/
package assignment10;
 
interface interfaceEg6{
	default void printM()
	{
		System.out.println("This is a default method");

	}
}
public class Interfaces6 implements interfaceEg6{
	public static void main(String[] args) {
		Interfaces6 ob=new Interfaces6();
		ob.printM();

	}

}
