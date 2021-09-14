//Create a PRIVATE or PROTECTED interface and print the values as above scenario
package assignment10;

class Interface9_1{
	protected interface Interface9_1_1{
		int a=30;
		void run();
		
	}
}

public class Interfaces9 implements Interface9_1.Interface9_1_1{
	
	public void run() {
		System.out.println("Running....");
	}

	public static void main(String[] args) {

		Interface9_1.Interface9_1_1 ob= new Interfaces9();
		ob.run();
	System.out.println(Interface9_1.Interface9_1_1.a);
	}

}
