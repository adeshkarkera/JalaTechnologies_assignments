/*Write two methods with the same name and same number of parameters of same type
and call from main method*/
package assignment13;

public class Methodoverloading3 {

	public static void main(String[] args) {
		Methodoverloading3 ob=new Methodoverloading3();
		ob.add(20, 3);
		ob.add(2, 3);
	}
	void add(int a, int b) {
		System.out.println(a+b);
	}
	/*void add(int a, int b) {
		System.out.println(a+b);// Compiler consider it as duplicate of the first method.
	}*/
}