package javaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapp {
	
	public static void main(String[] args) {
		
		//ways to declare HashMap
		
		HashMap hm=new HashMap();
		HashMap <Integer, Character>hm1=new HashMap<Integer, Character>();
		//Map m=new HashMap();
		
		//to add data and heterogenous data 
		hm.put(10, 'A');
		hm.put(11, "ree");
		hm.put(12, 123);
		hm.put(13, true);
		hm.put(14, 23.5);
		hm.put(15, 'X');
		
		hm1.put(16, 'A');
		hm1.put(17, 'K');
		hm1.put(18, 'L');
		hm1.put(19, 'R');
		hm1.put(20, 'B');
		hm1.put(21, 'C');
		
		System.out.println(hm); //{10=A, 11=ree, 12=123, 13=true, 14=23.5} //insertion order is not preserved, duplication not allwed
		
		//to retrieve particular key
		System.out.println(hm.get(10));
		
		//to remove particular record/key
		hm.remove(12);
		System.out.println(hm);
		
		//to search a particular key in hashmap
		System.out.println(hm.containsKey(14)); //true
		
		//to search  a value in hashmap
		System.out.println(hm.containsValue(23.5)); //true  
		System.out.println(hm.containsValue(123)); //false
		System.out.println(hm.containsValue("ree"));
		//to check weather hashmap is empty or not
		System.out.println(hm.isEmpty()); //false
		
		//to get size of hashmap
		System.out.println(hm.size()); //5
		
		//to clear all data from hashmap
		//hm.clear();
		//System.out.println(hm);
		
		//to get only all keys from hashmap and return type is set (bcz keys are unique)
		System.out.println(hm.keySet()); //[10, 11, 13, 14, 15]
		
		//to get only values from hashmap and return type is collection (bcz values can be duplicate)
		System.out.println(hm.values()); //[A, ree, true, 23.5, X]
		
		//to get entry/pair from hashmap and the return type is set
		System.out.println(hm.entrySet()); //[10=A, 11=ree, 13=true, 14=23.5, 15=X]
		
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
