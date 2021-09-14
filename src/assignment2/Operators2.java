//Write a method for increment and decrement operators(++, --)
package assignment2;

public class Operators2 {

	public static void main(String[] args) {
		int a[]= {4,5,6,7,8};
		int evn=0, odd=0;
		for(int i=0;i<5;i++) {
			
			if(a[i]%2==0) {
				evn++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Number of even numbers in the array a[]="+ evn);
		System.out.println("Number of odd number in the arrary a[]="+ odd);

	}

}
