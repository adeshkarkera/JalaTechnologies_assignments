//Extract a string using Substring
package assignment6;

public class Strings4 {

	public static void main(String[] args) {
		{  
			String str[] =  
			{  
			"Praveen Kumar",  
			"Yuvraj Singh",  
			"Harbhajan Singh",  
			"Gurjit Singh",  
			"Virat Kohli",  
			"Rohit Sharma",  
			"Sandeep Singh",  
			"Milkha Singh"  
			};  
			  
			String surName = "Singh";  
			int surNameSize = surName.length();  
			  			  
			for(int j = 0; j < str.length; j++)  
			{  
			    int length = str[j].length();  
			    // extracting the substring  
			    String subStr = str[j].substring(length - surNameSize);  
			      
			    // checks whether the surname is equal to "Singh" or not  
			    if(subStr.equals(surName))  
			    {  
			        System.out.println(str[j]);  
			    }  
			}  
			  
			}  
			} 
}
