package javapropack;

import java.util.HashMap;
import java.util.Map;

public class OccurencesofcharinString2 {
	
	public static void main(String[] args) {
		String s="numanoultravalcoscopic";
		
	char ch[]=	s.toCharArray(); //converting string to char array
	
	Map <Character,Integer>m=new HashMap<Character, Integer>(); //using hashmap collection to get key, value pair
	for(Character c: ch) { //using for each loop to check each character
		if(m.containsKey(c)) { //if the character is present already in key, value then increment the value of key
			m.put(c, m.get(c)+1);
		}else {					//if not present just add 1 , repeat the loop untill lenth of string is completed.
			m.put(c, 1);
		}
	}
	
	for(Character d:m.keySet()) { //now from we get keyset nothing but whuch has key, value
		if(m.get(d)>1) {
			System.out.println("repeated characters in string "+d+" is repeated "+m.get(d)+" times" );
		}
	}
	
	
	}

}
