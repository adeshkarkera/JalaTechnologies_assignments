//Create an interface with static final variable
package assignment10;

interface interfaceEg11{
	static int a=10;
	final int b=20;
}
public class Interfaces11 implements interfaceEg11{

	public static void main(String[] args) {
		System.out.println(interfaceEg11.a);
		
		System.out.println(interfaceEg11.b);

	}

}
