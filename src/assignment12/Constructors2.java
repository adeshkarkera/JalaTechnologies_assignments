//Call the constructors(both default and argument constructors) of super class from a child class

package assignment12;

class Constructors2_1{
	Constructors2_1()
	{
		System.out.println("Welcome to Constructors2_1 ");
	}
	Constructors2_1(String s)
	{
		System.out.println("Welcome to Constructors2_1 "+ s);
	}
}

public class Constructors2 extends Constructors2_1{
	
	Constructors2(){
		super();
	}
	Constructors2(String s){
		super(s);
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Constructors2 ob= new Constructors2();
		@SuppressWarnings("unused")
		Constructors2 ob1= new Constructors2("Adesh");

	}

}
