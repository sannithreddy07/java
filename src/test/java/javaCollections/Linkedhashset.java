package javaCollections;

import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Linkedhashset {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		
		
		//ways to deeclare LinkedHashSet
		
		LinkedHashSet hs=new LinkedHashSet(); //heterogenous data and default size 16 and loadfactor 0.75
		//LinkedHashSet hs1=new LinkedHashSet(100,(float)0.90); //initialize custom size and load factor
		//LinkedHashSet <Integer>hs3=new LinkedHashSet<Integer>(); //homegenous data
		
		//to add data
		hs.add(100);
		hs.add("jam");
		hs.add("jam"); //eventhough i add duplicate element it will not print in console --so duplication is not allowed
		hs.add('X');
		hs.add(45.5);
		hs.add(null);
		hs.add(true);
		System.out.println(hs);//[100, jam, X, 45.5, null, true] //insertion order preserved & duplication is not allowed
		
		//to remove data
		hs.remove('X');
		System.out.println(hs);
		
		//to get size
		System.out.println(hs.size());
		
		//to check LinkedHashSet is empty
		System.out.println(hs.isEmpty());//returs true if set is empty or false if not empty
		
		//to search an element in LinkedHashSet
		System.out.println(hs.contains("jam")); //return true if it is found or false
		
		//since there is no concept of indexes for loop is not allowed
		//to read each element in LinkedHashSet use for each loop 
		System.out.println("*********for loop for LinkedHashSet*******");
		for (Object temp:hs) { //since our data is heterogenous so use Object array to store diff type of data
		
			System.out.println(temp);
		}
		
		//another method to read each element from LinkedHashSet using Iterator interface
		System.out.println("*********for loop for LinkedHashSet*******");
		 Iterator it=hs.iterator();
		 while(it.hasNext()) { 				//to read each element from LinkedHashSet
			 System.out.println(it.next()); //to print the element which is found in LinkedHashSet and move to next
		 }
		
		 //To use data of multiple sets use addAll, ContainAll, retainAll, removeAll
		 
		 //Here using those methods we can union , intersection and differences of set1 and set2 
			System.out.println("*********union , intersection and differences of set1 and set2 *******");
		 LinkedHashSet <Integer>set1=new LinkedHashSet<Integer>();
		 set1.add(4);
		 set1.add(7);
		 set1.add(9);
		 set1.add(5);
		 set1.add(8);
		 System.out.println(set1);
//		 LinkedHashSet <Integer>set2=new LinkedHashSet<Integer>();
//		 set2.add(6);
//		 set2.add(7);
//		 set2.add(8);
//		 
//		 System.out.println(set2);
//		 
//		 //addAll method --union of set1 and set2
//		 set1.addAll(set2);
//		 System.out.println("union "+set1); //it print uncommon & common elements from set1 & set2
//		 
//		 //containsAll method
//		 System.out.println("subset "+set1.containsAll(set2)); //true //if atleast one element from set2 is matching with set1
//		 
////		 //retainAll
////		 set1.retainAll(set2);
////		 System.out.println("intersection "+set1); //intersection, gives common from set1 and set2
//		 
//		 //removeAll
//		 set1.removeAll(set2);
//		 System.out.println("differences "+set1); //it removes common elements from both sets and gives remaining elements from set1
		 
		 ArrayList <Integer>ar=new ArrayList<Integer>(set1);
			Collections.sort(ar);
			System.out.println(ar);
			Collections.sort(ar, Collections.reverseOrder());
			System.out.println(ar);
		 
	}
	

}

