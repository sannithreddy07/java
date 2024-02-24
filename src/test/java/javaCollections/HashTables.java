package javaCollections;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTables {
	public static void main(String[] args) {
		
		Hashtable <Integer, Character>hm1=new Hashtable<Integer, Character>();
	hm1.put(16, 'A');
	hm1.put(17, 'K');
	hm1.put(18, 'L');
	hm1.put(19, 'R');
	hm1.put(20, 'B');
	hm1.put(21, 'C');
	//hm1.put(null, 'W'); //in Hashtable null values are not allowed -java.lang.NullPointerException
	
	System.out.println(hm1); //insertion order is not preserved, duplication keys not allwed
	
	//to retrieve particular key
	System.out.println(hm1.get(17));
	
	//to remove particular record/key
	hm1.remove(21);
	System.out.println(hm1);
	
	//to search a particular key in hashmap
	System.out.println(hm1.containsKey(16)); //true
	
	//to search  a value in hashmap
	System.out.println(hm1.containsValue('A')); //true  
	System.out.println(hm1.containsValue('X')); //false

	//to check weather hashmap is empty or not
	System.out.println(hm1.isEmpty()); //false
	
	//to get size of hashmap
	System.out.println(hm1.size()); //
	
	//to clear all data from hashmap
	//hm.clear();
	//System.out.println(hm);
	
	//to get only all keys from hashmap and return type is set (bcz keys are unique)
	System.out.println(hm1.keySet()); //
	
	//to get only values from hashmap and return type is collection (bcz values can be duplicate)
	System.out.println(hm1.values()); //
	
	//to get entry/pair from hashmap and the return type is set
	System.out.println(hm1.entrySet()); //
	
	//to read each key from hashmap
	for(Object temp:hm1.keySet()) {
	System.out.println(temp); //to read each key from hashmap
		
	}
	for(Object temp1:hm1.values()) {
		System.out.println(temp1); //to read each value from hashmap
			
		}
	System.out.println("**********for loop*********");
	for(Object temp3:hm1.keySet()) {
		System.out.println(temp3+"  "+hm1.get(temp3)); //to read each key and get value of it from hashmap
	}	
	//Entry methods
	System.out.println("**********Entry methods*********");
		//below hashmap is based on homegenous data, so that we cannot use Object array
	for(Map.Entry entry:hm1.entrySet()) { //to read eack entry from hashmap and return Set
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	//Iterator method
	System.out.println("**********Iterator method*********");
	Set s=hm1.entrySet(); //since entryset will Set type data  , so assign it a Set variable
		Iterator it=s.iterator();
		while(it.hasNext()) {
		Map.Entry	entry1=(Entry) it.next(); //16 A
		System.out.println(entry1.getKey()+"  "+entry1.getValue());
		
		}

}
}
