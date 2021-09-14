//Write a program to generate NoSuchMethodException
package assignment14;
import java.lang.reflect.*;  

public class Exceptions14 {

	public static void main(String[] args) {
		Exceptions14 class1 = new Exceptions14();  
	      Class cls = class1.getClass();  
	  
	      try {                  
	         Method mthd = cls.getMethod("showMetho", null);  
	         System.out.println("method = " + mthd.toString());          
	      } catch(NoSuchMethodException e) {  
	         System.out.println(e.toString()); //print exception object  
	      }  
	   
	      try {  
	         Class[] aarg = new Class[1];  
	         aarg[0] = Long.class;  
	         Method lmthd = cls.getMethod("showLongMethod", aarg);  
	         System.out.println("method = " + lmthd.toString());  
	      } catch(NoSuchMethodException e) {  
	         System.out.println(e.toString()); //print exception object  
	      }  
	}
	public Integer showMethod() {  
	      return 1;  
	   }  
	      
	   public void showLongMethod(Long lng) {  
	      this.lng = lng;  
	   }  
	   long lng = 788995;  

}
