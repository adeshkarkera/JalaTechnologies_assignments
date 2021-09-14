/*Create a class with PROTECTED fields and methods. Access these fields and methods
from any other class in the same package.*/
package assignment8;

public class Accessmodifiers3 {

	public static void main(String[] args) {
		Accessmodifiers3_1 obj=new Accessmodifiers3_1();
		System.out.println(obj.a);// accessing the variabel from 'assignment8_question3.Accessmodifiers8_question3.java'
		obj.printProtectedMethod();//accessing the method from 'assignment8_question3.Accessmodifiers8_question3.java'.

	}

}

