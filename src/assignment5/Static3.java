//Print static variables in Instance methods
package assignment5;

public class Static3 {
	static int a=10;

	public static void main(String[] args) {
		Static3 s1 =new Static3();
		
		s1.printA(a);

	}
	void printA(int a)
	{
		System.out.print(a);
	}

}
