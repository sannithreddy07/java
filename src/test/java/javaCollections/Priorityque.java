package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityque {
	
	public static void main(String[] args) {
		
		//ways to declare priority que
		
		PriorityQueue pq=new PriorityQueue();
	//	Queue pq1=new PriorityQueue();
	//	PriorityQueue <String>pq3=new PriorityQueue<String>(); // pq allows only homgenous data no need to use datatype
//		 pq.add("ring");
//		 pq.add('A');
//		 pq.add(200);
//		 pq.add(true);
//		 pq.add(null); // since this data is heterogenous data you get this -java.lang.ClassCastException:
		
		//add or offer
		pq.add(150);
		pq.add(100);
		 pq.add(200);
		 pq.add(123);
		 pq.add(111); //insertion order is not preserved 
		 pq.offer(134);
		 pq.offer(134); //duplication is allowed
		 System.out.println(pq); 
		 
		 //to get only Head element from queue //element or peek
		 
		 //System.out.println(pq.element()); //100 //if no element in queue --java.util.NoSuchElementException
		// System.out.println(pq.peek()); //100 // if no element in queue [] null
		 
		 //to remove and return the removed element 
		 
//		System.out.println(pq.remove()); // it removes head element  and if specific element is given return -true  //if no element in queue -exception
//		System.out.println(pq); //[111, 123, 134, 150, 134, 200]
//		 
//		
//		 System.out.println(pq.poll());// it removes head element 100
//		 System.out.println(pq);  // if no element in queue [] null
		 
		 Iterator it=pq.iterator(); //to read each element and print
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
	//to sort priority que first we need to convert it to list then sort
		 
		 Queue ls=new PriorityQueue();
		System.out.println(pq);
		//Collections.sort(pq);
	}

}
