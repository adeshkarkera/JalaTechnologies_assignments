//How to create a class, object, method and its signature.
package assignment1;

//Class with name Java_basic1 is created.The accesses specifier is set to 'public'which means it can be accessed by any other classes
public class Java_basic1 {
      int i;

 /*Method 'main' is created with the return type 'void', which means the method will not return any
 value. Signature refers to the method name and parameter list in the method(main(String args[]))*/
	public static void main(String[] args) {
		
		// Object 'obj' is created for the Class 'Java_basic1.		
		Java_basic1 obj = new Java_basic1();
		 obj.i=5;
		 System.out.println("Thye value of the \'obj.i\'= " + obj.i);

	}

}
