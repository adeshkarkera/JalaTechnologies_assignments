//Print the fields/instance members of the current class using this and without using object
package assignment11;

public class Thisandsuper1 {
	int a,b;
	void printAB(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		Thisandsuper1 ob=new Thisandsuper1();
		ob.printAB(10, 5);
	}

}
