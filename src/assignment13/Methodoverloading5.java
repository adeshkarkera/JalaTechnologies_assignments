/* Write two methods with the same name, number of parameters and data type but
different return Type*/
package assignment13;

public class Methodoverloading5 {
	public static void main(String[] args) {
		Methodoverloading4 ob=new Methodoverloading4();
		ob.add(2, 3);
		ob.add(2, 3);
	}
	void add(String a, String b) {
		System.out.println(a+b);
	}
	int add(int a, int b) {
		
		return(a+b);
	}
}


