//Write a program to generate ArrayIndexOutOfBoundException
package assignment14;

public class Exceptions9 {

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
