/*Create an ArrayList of type String with 10 string elements. Add 10 string elements to
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList*/
package assignment16;

import java.util.*;

public class Collections1 {

	public static void main(String[] args) {
		ArrayList <String> list= new ArrayList<String>();
		list.add("rahul");
		list.add("rohith");
		list.add("pujara");
		list.add("virat");
		list.add("rahane");
		list.add("panth");
		list.add("jadeja");
		list.add("shami");
		list.add("ishanth");
		list.add("bumrha");
		//Add an element to the ArrayList
		list.add("siraj");
		//Iterate through the ArrayList by using Iterator object
		@SuppressWarnings("rawtypes")
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Add an element at a specific index
		list.add(4,"suryakumar");
		//Remove an element from the ArrayList, Remove at an index
		list.remove(5);
		//Update the element at a specific index
		list.set(6, "ashwin");
		//Check the element is present at a particular index
		System.out.println("\nIndex of rahul: "+list.indexOf("rahul"));
		//Get an element at a particular index
		System.out.println("\nElementat Index[3]: "+list.get(3));
		//Find out the size of the ArrayList
		System.out.println("\nSize: "+list.size());
		//Check the given element is present in the ArrayList*
		System.out.println("\nDoes array lis contain\"virat\": "+list.contains("virat"));
		//Remove all elements of the ArrayList
		list.clear();
	}

}
