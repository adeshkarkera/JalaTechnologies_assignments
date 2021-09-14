//Write a method which throws exception, Call that method in main class without try block
package assignment14;

public class Exceptions3 {

	public static void main(String[] args) {
		int n=3;
		int a[]=new int[n];
		addElement( a,4);

	}

	static void addElement(int[] a, int num)
	{
		int l= a.length;
		a[l+1]=num;
		System.out.println(a[l+1]);
	}
}
