//Call argument constructor of current class using this()
package assignment11;

public class Thisandsuper4 {
	Thisandsuper4(){
		System.out.print("Welcome ");
	}

	Thisandsuper4(String s){
		this();
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Thisandsuper3 ob=new Thisandsuper3(" Oggy");
	}

}
