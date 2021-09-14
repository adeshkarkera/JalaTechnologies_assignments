/*A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B.
Create three methods in each class, 2 methods are specific to each class and third
method (override method) should be in all three Classes A, B and C
Create a class with main method. Create an object for each class A, B and C in main
method and call every method of each class using its own object/instance.
Call an overridden method with super class reference to B and C class’s objects
Runtime Polymorphism with Data Members/Instance variables, Repeat the above
process only for data members*/
package assignment7;

public class Inheritance1 {

	public static void main(String[] args) {
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		obj1.inheritanceOrder();
		obj1.printHi();
		obj1.printHello();
		obj2.inheritanceOrder();
		System.out.println(obj2.printClassName());
		System.out.println(obj2.printSuperClass());
		obj3.inheritanceOrder();
		obj3.eat();
		obj3.walk();
		System.out.println("\nMethod overiding");
		A obj4=new B();
		obj4.inheritanceOrder();
		
		A obj5=new C();
		obj5.inheritanceOrder();
		
		System.out.println("\nData Members/Instance variables");
		System.out.println("Class A/na:"+obj1.a);
		System.out.println("b:"+obj1.b);
		System.out.println("c:"+obj1.c);
		System.out.println("Class B\na:"+obj2.a);
		System.out.println("d:"+obj2.c);
		System.out.println("e:"+obj2.e);
		System.out.println("Class C\na:"+obj3.a);
		System.out.println("f:"+obj3.f);
		System.out.println("g:"+obj3.g);

		System.out.println("\nRuntime Polymorphism with Data Members/Instance variables");
		System.out.println("a:"+obj4.a);

		
		System.out.println("a:"+obj5.a); // we can't override the Data members. Value of Super class data member is written here




	}
}
	class A{
		int a=10,b=20,c=30;
		void inheritanceOrder() {
			System.out.println("Super class: A");
		}
		void printHi(){
			System.out.println("Hi!!");
		}
		void printHello() {
			System.out.println("Hello");
		}
	}

	class B extends A{
		int a=50, d=60,e=70;

		void inheritanceOrder() {
			System.out.println("\nSub class of: A");
		}
		String printClassName() {
			return "B";
		}
		String printSuperClass() {
			return "A";
		}
	}
	class C extends B{
		int a=80, f=90,g=100;
		void inheritanceOrder() {
			System.out.println("\nSub class of: B");
		}
		void eat() {
			System.out.println("Eating...");
		}
		void walk() {
			System.out.println("walking...");
		}
}
