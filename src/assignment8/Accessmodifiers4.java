/*Create a class with PUBLIC fields and methods.
Access the public methods and fields from any class in the same package or different
package.*/
package assignment8;

public class Accessmodifiers4 {
	public int a=10;
	public void printpublicmethod() {
		System.out.println("This is a public method...");
	}

	public static void main(String[] args) {
		Accessmodifiers4 obj=new Accessmodifiers4();
		System.out.println(obj.a);
		obj.printpublicmethod();
		publicEg obj1=new publicEg();
		obj1.printPublicVar();
	}

}
class publicEg{
	Accessmodifiers4 obj2=new Accessmodifiers4();
	void printPublicVar(){
		System.out.println("Accessing public variable \'a\' from diffrent class: "+obj2.a);

}
}