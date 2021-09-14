//Splitting strings with split()
package assignment6;

public class Strings11 {

	public static void main(String[] args) {
		String s="How are you?";
		String sub[]=s.split(" ");
		for(int i=0;i<sub.length;i++) {
			System.out.println("sub["+i+"]: "+sub[i]);
			
		}

	}

}
