//Print instance variables in static methods
package assignment5;

public class Static2 {
	int a=20,b=30;
		public static void main(String[] args) {
			Static2 s1=new Static2();

			printAB(s1.a,s1.b);
			

		}
	static void printAB(int a, int b) {

		System.out.println(a+" "+b);
		
	}
	}



