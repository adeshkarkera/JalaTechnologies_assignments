//Write a program for a Single line comment, multi-line and documentation comments
package assignment1;
/**
* Using documentation comments, single comments and multi-line comment.
* Bellow program returns the square root of a number.
*/

public class Java_basic3
{
 public static void main(String[] args)
 {
     System.out.println(sqrt(16/*The method 'sqrt()' will calculate the square root of 16*/));
 }

 /**
  * computes sqrt of passed number of type double.
  * @param x double
  * @return sqrt of x
  */
 public static double sqrt (double x)
 {		
     return Math.sqrt(x);
 }
}
 
