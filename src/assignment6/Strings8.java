//equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
package assignment6;

public class Strings8 {

	public static void main(String[] args) {
		String s1= "Hello World!!";
		String s2="Hello woRld!!";
		System.out.println("Is s1=s2: "+ s1.equalsIgnoreCase(s2));
		System.out.println("Does s1 starts with \'Hello\': "+ s1.startsWith("Hello"));
		System.out.println("Does s2 ends with \'woRld!!\': "+ s2.endsWith("woRld!!"));
		System.out.print("Is s1==s2: " );
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);

		}

	}

}
