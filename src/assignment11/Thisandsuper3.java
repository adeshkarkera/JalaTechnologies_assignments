//Call constructor of the current class using this()
package assignment11;

public class Thisandsuper3 {
	Thisandsuper3(){
		System.out.print("Welcome ");
	}

	Thisandsuper3(String s){
		this();
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Thisandsuper3 ob=new Thisandsuper3(" Oggy");
	}

}
