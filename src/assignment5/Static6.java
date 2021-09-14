//Print all the static, instance variables in main method
package assignment5;

public class Static6 {
	int a=10,b=20;
	static int c=30,d=40;
	public static void main(String[] args) {
		Static6 s1=new Static6();
		System.out.println("Instance variables: "+s1.a+" "+s1.b);
		System.out.println("Static variables: "+c+" "+d);

	}

}
