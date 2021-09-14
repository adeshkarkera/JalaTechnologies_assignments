/*Create a class with PROTECTED fields and methods. Access these fields and methods
from any other class in the same package.
Also, Access the PROTECTED fields and methods from child class located in a different
package
Access the PROTECTED fields and methods from any class in different package*/

package assignment8_question3;
import assignment8.*;
public class Accessmodifiers3q3 extends Accessmodifiers3_1 {

	public static void main(String[] args) {
		Accessmodifiers3q3 obj=new Accessmodifiers3q3();
		obj.printProtectedMethod();
		System.out.println(obj.a);

	}

}
//Not able toAccess the PROTECTED fields and methods from any class in different package
/*class C{
	Accessmodifiers3_1 obj1= new Accessmodifiers3_1();
	void printprotected(){
	System.out.println( (obj1.printProtectedMethod());
	}
	
}*/