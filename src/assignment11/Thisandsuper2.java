//Print the fields/instance members of the parent class using super
package assignment11;

public class Thisandsuper2 {

	public static void main(String[] args) {

		Splender ob=new Splender();
		ob.printbike();
	}

}

class Bike{
	String bike="Bike";
}
class Splender extends Bike{
	String bike="splender";
	void printbike() {
	System.out.println(super.bike);//Prints the vriable of super class Bike.
	System.out.println(bike);

	}
	
}