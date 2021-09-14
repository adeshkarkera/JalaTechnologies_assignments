// Program for relational operators (<,<==, >, >==)
package assignment2;

public class Operators6 {
public static void main(String args[]) {
	int a=10, b=20, c=15;
	
	if(a<b) {
		System.out.println("\'b\' is greater than \'a\'");
	}
	if(a>c) {
		System.out.println("\'a\' is greater than \'c\'");

	}
	if(b<=c) {
		System.out.println("\'c\' either greater than \'b\' or \'c\' is equal to \'b\'");
	}
	if(b>=a) {
		
		System.out.println("\'b\' is either greater than \'a\' or equal to \'a\'");
	}
}
}
