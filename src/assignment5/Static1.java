//Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method
package assignment5;

public class Static1 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.rollno=111;
		s1.name="jac";
		s1.printName(s1.name);
		s1.printRollNo(s1.rollno);
		Student.college="SSI";
		Student.classroom='A';
		Student.printCollege(Student.college);
		Student.printclassRoom(Student.classroom);
		

	}

}
class Student{
	
	int rollno;//instance variable
	String name;//instance variable
	static String college;//static variable
	static char classroom;//static variable
	void printName(String Name){//instance method
	System.out.println(Name);
	
	}
	void printRollNo(int r) {//instance method
				System.out.println(r);
	}
	static void printCollege(String c) {//static method
		System.out.println(c);
	}
	static void printclassRoom(char c) {//static method
		System.out.println(c);
	}
	
}
