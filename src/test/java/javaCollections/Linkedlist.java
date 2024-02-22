package javaCollections;

import java.util.LinkedList;

import java.util.Collections;
import java.util.Iterator;

public class Linkedlist {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
	
	
	//ways to declare an LinkedList

			//List ll=new LinkedList();
			//List <String>ll= new LinkedList<String>();
			
		LinkedList<Comparable> ll=new LinkedList<Comparable>();
			//add method  --add(index, object)
					ll.add("srei");
					ll.add(50);
					ll.add(true);
					ll.add(50.5);

			
System.out.println(ll);
			


			//addAll method --add(index, collection)

			//to use addlll method create another list and copy the ll2 data to ll or vice versa
			LinkedList ll2= new LinkedList();
		
			
			 ll2.addAll(ll);// addlll method
			System.out.println(ll2);


			//remove method

			//		ll.remove(3);
			//		System.out.println(ll);

			//removelll method

					ll2.removeAll(ll);
					System.out.println(ll2);

			//get method

					System.out.println(ll.get(2)); //to get data of particular index

			//set method

					ll.set(1, "bheem"); //to replace any element in the index
			//		System.out.println(ll);

			//size method

//			ll.size();
			System.out.println(ll.size());
//
//			//isEmpty method
//
//			ll.isEmpty();
			System.out.println("it will check weather the linkedlist is empty or not--> "+ll.isEmpty()); // it will weather the Linked is empty or not  (return ttrue/fllse)
//
//			//contains method 
//
//			ll.contains("sai");
			System.out.println("it will check particular string is present in Linkedlist or not--> "+ll.contains("srei")); //it will check particular string is present in Linked or not (return ttrue/fllse)
//
//			//containsAll method
//
//			ll.containsAll(ll2); //it will check weather lll elements of collection ll2 present in ll or not 
			System.out.println("it will check weather All elements of collection ll present in ll2 or not--> "+ll.containsAll(ll2));

			//toArray

			//		System.out.println(ll.toLinked());

			//toString

			//		System.out.println(ll.toString());

			//for loop  //to read each element from Linkedlist

			System.out.println("for loop Linked list");
			for(int i=0;i<ll.size();i++) {
				System.out.println(ll.get(i));// to retrieve each element use get(index) method
		}
	//
			//for each loop
		System.out.println("for each loop Linkedlist");	
		for(Object temp:ll) {   //assing each element in temp variable and print and 
		System.out.println(temp); //reomve that from temp and replace with new one and repaet till loop ends
								//if Linkedlist object has lll kinds of data/heteorgenous data and want to print that in for each loop use Object Linked
								//ex: for(Object temp:ll);					
				
			}
	
			//iterator //this is from collectio frameworks
	
			System.out.println("iterator in Linkedlist");
			Iterator it=ll.iterator(); //Iterator is interface from Collection Interface
			while(it.hasNext()) { //it will check/read the elemnets present in Linkedlist or not 
								//if true follow iteration--fllse exit
		System.out.println(it.next()); //if true it will check each element and print that element and go for next 
			}
		
		System.out.println("******to sort elemnets of Linkedlist");//for sorting the datatype shpuld be same / homogenous data
		LinkedList<Integer> ll3=new LinkedList<Integer>();
		ll3.add(112);
		ll3.add(43);
		ll3.add(12);
		ll3.add(142);
		Collections.sort(ll3); 
		System.out.println(ll3);
		
		System.out.println("*****to sort elemnets of Linkedlist in reverse order");
		Collections.sort(ll3, Collections.reverseOrder());
		System.out.println(ll3);
		
		System.out.println("*********to shuffle elemnets of Linkedlist it means to print randomly each time you execute in Linkedlist");		
		Collections.shuffle(ll); //for shuffling the data can be heterogenous
		System.out.println(ll);
		
		LinkedList ll4=new LinkedList();
		ll4.add("cat");
		ll4.add(50);
		ll4.add('A');
		ll4.add(50.5);
		System.out.println("Before adding stack/queue methods "+ll4);
		
		//LikedList special methods (since it is a combination List & DeQueue Interface)
		
		System.out.println("*******LinkedList stack/queue methods****** ");
		
		ll4.addFirst("Animal");
		ll4.addLast("Dog");
		
		System.out.println("After adding stack/queue methods "+ll4);
		
		System.out.println("*******to retreive only first/LAst object from linkedlist****** ");
		
		System.out.println("to retreive only first object from linkedlist "+ll4.getFirst());
		System.out.println("to retreive only last object from linkedlist "+ll4.getLast());
		
		System.out.println("*******to remove only first/LAst object from linkedlist****** ");
		
		System.out.println("to remove only first object from linkedlist "+ll4.removeFirst());
		System.out.println("to remove only LAst object from linkedlist "+ll4.removeLast());
		System.out.println("After removing first/Last objects "+ll4);
		
		

			}

		}





