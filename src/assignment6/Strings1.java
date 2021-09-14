//Different ways creating a string
package assignment6;

public class Strings1 {

	public static void main(String[] args) {
		String name="max";//Using String literal
		String name1=new String("Jac");//Using new keyword
		char name2[]= {'o','g','g','y'};
		String name3=new String(name2);//Using character array
		
		System.out.println(name+"\n"+name1+"\n"+name2[0]+"\n"+name3);

	}

}
