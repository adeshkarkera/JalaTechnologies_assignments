//Call constructor of the parent class using super()
package assignment11;

public class Thisandsuper5 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Dog ob=new Dog();
		

	}

}
class Animal{
	Animal(){
		System.out.println("Animal is created");
	}
}
class Dog extends Animal{
	Dog(){
		super();
		System.out.println("Dog is created");

	}
}