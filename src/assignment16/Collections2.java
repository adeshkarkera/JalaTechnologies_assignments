/*Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map*/
package assignment16;
import java.util.*;
public class Collections2 {

	public static void main(String[] args) {
		HashMap <Integer,String>map=new HashMap<Integer,String>();
		map.put(111,"rahul");
		map.put(112,"rohith");
		map.put(113,"pujara");
		map.put(114,"virat");
		map.put(115,"rahane");
		map.put(116,"panth");
		map.put(117,"jadeja");
		map.put(118,"ishanth");
		map.put(119,"shami");
		map.put(120,"bumrha");
		System.out.println("The HashMap: ");
		for(@SuppressWarnings("rawtypes") Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//Insert a Key value mapping into the map
		map.put(121, "siraj");
		System.out.println("\n"+map);
		//Fetch the value of a Key
		System.out.println("\nThe value of key 112 is: " + map.get(112));
		//Create a clone/copy of HashMap
		HashMap<Integer, String> clonedMap = new HashMap<>();
		clonedMap.putAll(map);
		System.out.println("\n"+clonedMap);
		//Check if the given Key is in the Map
		System.out.println("\n111: "+map.containsKey(111));
		//Check if the value is in the Map
		System.out.println("\nvirat: "+map.containsValue("virat"));
		//Check if the map is empty
		System.out.println("\nIs Empty: : "+map.isEmpty());
		//Print the size of the Map to the console
		System.out.println("\nSize: "+map.size());
		//Print all the Keys of the map to the console
		System.out.println("\nKeys: "+map.keySet());
		//Remove a specific Key-value pair
		map.remove( 121,  "siraj");
		System.out.println("\n"+map);
		//Copy all the elements of the Map to another Map
		HashMap<Integer, String> clonedMap1 = new HashMap<>();
		clonedMap1.putAll(map);
		System.out.println("\n CloneMap: "+clonedMap1);
		
	}

}
