/*Write two methods with the same name but different number of parameters of same type
and call the methods from main method*/
package assignment13;

public class Methodoverloading1 {

	public static void main(String[] args) {
		Methodoverloading1 ob=new Methodoverloading1();
		ob.add(2, 3);
		ob.add(2, 3,4);
	}
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}
