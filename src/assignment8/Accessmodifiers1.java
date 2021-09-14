/* Create a class with PRIVATE fields, private method and a main method. Print the fields
in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class.*/
package assignment8;

public class Accessmodifiers1 {
	private int a=10;
	private void printPriveteMethod() {
		System.out.println("This is a private method...");
	}
	public static void main(String[] args) {
		Accessmodifiers1 obj=new Accessmodifiers1();
		System.out.println(obj.a);
		obj.printPriveteMethod();
		//A obj2=new A();
		//obj2.printPriveteMethod();(private access modifier can't be accessed by the sub class

	}

}
class A extends Accessmodifiers1{
	int b=10;
}