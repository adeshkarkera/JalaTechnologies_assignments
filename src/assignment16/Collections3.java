/*Create a HashSet with at least 10 elements of type String
Write program covering all the operations of HashSet*/
package assignment16;
import java.util.*;
public class Collections3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		HashSet<String>hash= new HashSet();
		// inserting values to the Hashset.
		hash.add("one");
		hash.add("two");
		hash.add("three");
		hash.add("four");
		hash.add("five");
		hash.add("six");
		hash.add("seven");
		hash.add("eight");
		hash.add("nine");
		hash.add("ten");
		//Iterators
		Iterator <String> itr= hash.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		//checking for a value
		System.out.println("\n contains five: "+ hash.contains("five"));
		//removing a value
		hash.remove("ten");
		//size of HashSet
		System.out.println("\n Size: "+ hash.size());
        //Spliterator
		 Spliterator<String> namesSpliterator = hash.spliterator();             
	        namesSpliterator.forEachRemaining(System.out::println);  
	        //Creating a new cloned set  
            HashSet<String> clonedSet = new HashSet<String>();  
            //Clone the HashSet  
            clonedSet = (HashSet)hash.clone();  
            //Displaying the new Set after Cloning;  
            System.out.println("The new clone set elements: " + clonedSet);  
            //removing all the elements
            hash.clear();
            //Checking if empty
            System.out.println("\nIs empty: "+hash.isEmpty());
	}

}
