//Write a program to generate NoSuchFieldException
package assignment14;

import java.lang.reflect.*;  
public class Exception13 {
	
	public Exception13(String str) {         
	    this.str = str;  
	 }  
	    
	 public String str = "Hello";
	public static void main(String[] args) {
		Exception13  obj = new Exception13("hi");  
	      Class class1 = obj.getClass();  //gets the class  
	  
	      System.out.println("Field got  =");  
	      try {  
	          
	         Field Flds = class1.getField("st");  
	         System.out.println(" field found: " + Flds.toString());  
	      } catch(NoSuchFieldException e) {  
	         System.out.println(e.toString());  
	      }  

	}

  
}   