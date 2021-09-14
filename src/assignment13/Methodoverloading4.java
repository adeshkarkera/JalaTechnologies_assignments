/*Write two methods with the same name and same number of parameters of different
type and call from main method*/
package assignment13;

public class Methodoverloading4 {

		public static void main(String[] args) {
			Methodoverloading4 ob=new Methodoverloading4();
			ob.add("2", "3");
			ob.add(2, 3);
		}
		void add(String a, String b) {
			System.out.println(a+b);
		}
		void add(int a, int b) {
			System.out.println(a+b);
		}
	}