package javaCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Hashsetcl {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		//ways to deeclare HashSet
		
		HashSet hs=new HashSet(); //heterogenous data and default size 16 and loadfactor 0.75
		//HashSet hs1=new HashSet(100,(float)0.90); //initialize custom size and load factor
		//HashSet <Integer>hs3=new HashSet<Integer>(); //homegenous data
		
		//to add data
		hs.add(100);
		hs.add("jam");
		hs.add('X');
		hs.add(45.5);
		hs.add(null);
		hs.add(true);
		System.out.println(hs); //insertion order not preserved & duplication not allowed
		
		//to remove data
		hs.remove('X');
		System.out.println(hs);
		
		//to get size
		System.out.println(hs.size());
		
		//to check hashset is empty
		System.out.println(hs.isEmpty());//returs true if set is empty or false if not empty
		
		//to search an element in hashset
		System.out.println(hs.contains("jam")); //return true if it is found or false
		
		//since there is no concept of indexes for loop is not allowed
		//to read each element in hashset use for each loop 
		System.out.println("*********for loop for HashSet*******");
		for (Object temp:hs) { //since our data is heterogenous so use Object array to store diff type of data
		
			System.out.println(temp);
		}
		
		//another method to read each element from hashset using Iterator interface
		System.out.println("*********for loop for HashSet*******");
		 Iterator it=hs.iterator();
		 while(it.hasNext()) { 				//to read each element from hashset
			 System.out.println(it.next()); //to print the element which is found in hashset and move to next
		 }
		
		 //To use data of multiple sets use addAll, ContainAll, retainAll, removeAll
		 
		 //Here using those methods we can union , intersection and differences of set1 and set2 
			System.out.println("*********union , intersection and differences of set1 and set2 *******");
		 HashSet <Integer>set1=new HashSet<Integer>();
		 set1.add(4);
		 set1.add(5);
		 set1.add(6);
		 set1.add(7);
		 set1.add(8);
		 System.out.println(set1);
		 HashSet <Integer>set2=new HashSet<Integer>();
		 set2.add(6);
		 set2.add(7);
		 set2.add(8);
		 
		 System.out.println(set2);
		 
		 //addAll method --union of set1 and set2
		 set1.addAll(set2);
		 System.out.println("union "+set1); //it print uncommon & common elements from set1 & set2
		 
		 //containsAll method
		 System.out.println("subset "+set1.containsAll(set2)); //true //if atleast one element from set2 is matching with set1
		 
//		 //retainAll
//		 set1.retainAll(set2);
//		 System.out.println("intersection "+set1); //intersection, gives common from set1 and set2
		 
		 //removeAll
		 set1.removeAll(set2);
		 System.out.println("differences "+set1); //it removes common elements from both sets and gives remaining elements from set1
		 


		 
	}
	

}
