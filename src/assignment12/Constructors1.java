/*Write a class with a default constructor, one argument constructor and two argument
constructors. Instantiate the class to call all the constructors of that class from a main
class*/
package assignment12;

public class Constructors1 {
	String fName,lName;
	Constructors1(){
		System.out.println("Welcome");
	}
	Constructors1(String fName){
		this.fName=fName;
		System.out.println("Welcome "+ fName);
	}
	Constructors1(String fName, String lName){
		this.fName=fName;
		this.lName=lName;
		System.out.println("Welcome "+ fName+" "+lName);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Constructors1 ob=new Constructors1();
		@SuppressWarnings("unused")
		Constructors1 ob1=new Constructors1("Adesh");
		@SuppressWarnings("unused")
		Constructors1 ob2= new Constructors1("Adesh","Kakera");

	}

}
