/*Write two methods with the same name but different number of parameters of different
data type and call the methods from main method*/
package assignment13;

public class Methodoverloading2 {

	public static void main(String[] args) {
		Methodoverloading2 ob=new Methodoverloading2();
		ob.add("2", "3");
		ob.add(2, 3,4);
	}
	void add(String a, String b) {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}