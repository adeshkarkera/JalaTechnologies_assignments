//Apply private, public, protected and default access modifiers to the constructor
package assignment12;

class Constructors3_1{
	protected Constructors3_1(){
	System.out.println("Welcome to Constructors3_1");
	}
}
class Constructors3_2{
	 Constructors3_2(){
	System.out.println("Welcome to Constructors3_2");

	}
	
}
class Constructors3_3{
	public Constructors3_3(){
		System.out.println("Welcome to Constructors3_3");

	}
}
class Constructors3_4{
	private Constructors3_4(){
		System.out.println("Welcome to Constructors3_4");

	}
}

public class Constructors3 {
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Constructors3_4 ob=new Constructors3_4(); We are not able to access the contructor from the other class for private access modifier.
		Constructors3_1 ob1=new Constructors3_1();
		Constructors3_2 ob2=new Constructors3_2();
		Constructors3_3 ob3=new Constructors3_3();

	}

}
