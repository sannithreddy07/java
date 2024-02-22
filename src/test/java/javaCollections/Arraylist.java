package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {

		//ways to declare an ArrayList

		//ArrayList al=new ArrayList();

		//List al=new ArrayList();
		//add method  --add(index, object)
		//		al.add("srei");
		//		al.add(50);
		//		al.add(true);
		//		al.add(50.5);

		ArrayList <String>al= new ArrayList<String>();

		//add method  --add(index, object)
		al.add("sri");
		al.add("sai");
		al.add("sii");
		al.add("srei");
		System.out.println(al); //only add method


		//addAll method --add(index, collection)

		//to use addAll method create another list and copy the al2 data to al or vice versa
		ArrayList <String>al2= new ArrayList<String>();
		al2.add("jai");
		al2.add("ram");
		//		System.out.println(al2); //before addAll method
		al.addAll(1, al2); //after addAll method
		//		System.out.println(al);


		//remove method

		//		al.remove(3);
		//		System.out.println(al);

		//removeAll method

		//		al.removeAll(al2);
		//		System.out.println(al);

		//get method

		//		al.get(2); //to get data of particular index

		//set method

		//		al.set(1, "bheem"); //to replace any element in the index
		//		System.out.println(al);

		//size method

		al.size();
		System.out.println(al.size());

		//isEmpty method

		al.isEmpty();
		System.out.println("it will weather the array is empty or not--> "+al.isEmpty()); // it will weather the array is empty or not  (return ttrue/false)

		//contains method 

		al.contains("sai");
		System.out.println("it will check particular string is present in array or not--> "+al.contains("sai")); //it will check particular string is present in array or not (return ttrue/false)

		//containsAll method

		al.containsAll(al2); //it will check weather all elements of collection al2 present in al or not 
		System.out.println("it will check weather all elements of collection al2 present in al or not--> "+al.containsAll(al2));

		//toArray

		//		System.out.println(al.toArray());

		//toString

		//		System.out.println(al.toString());

		//for loop  //to read each element from arraylist

//		System.out.println("for loop array list");
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));// to retrieve each element use get(index) method
//		}
//
//		//for each loop
//		System.out.println("for eah loop arraylist");	
//		for(String temp:al) { // assing each element in temp variable and print and 
//			//reomve that from temp and replace with new one and repaet till loop ends
//			//if arraylist object has all kinds of data/heteorgenous data and want to print that in for each loop use Object Array
//			//ex: for(Object temp:al);
//							
//			System.out.println(temp);
//		}
//
//		//iterator //this is from collectio frameworks
//
//		System.out.println("iterator in arraylist");
//		Iterator it=al.iterator(); //Iterator is interface from Collection Interface
//		while(it.hasNext()) { //it will check/read the elemnets present in arraylist or not 
//			//if true follow iteration--false exit
//	System.out.println(it.next()); //if true it will check each element and print that element and go for next 
	
	
	System.out.println("******to sort elemnets of arraylist");
	Collections.sort(al);
	System.out.println(al);
	
	System.out.println("*****to sort elemnets of arraylist in reverse order");
	Collections.sort(al, Collections.reverseOrder());
	System.out.println(al);
	
	System.out.println("*********to shuffle elemnets of arraylist it means to print randomly each you execute in arraylist");		
	Collections.shuffle(al);
	System.out.println(al);
	
	//To conver array to arrayList
	
	String arr[]= {"apple" ,"ball","cat"};
	
	for(String temp:arr) {
		System.out.println("***before converting array to arraylist  "+temp);
	}
	
	ArrayList al3=new ArrayList(Arrays.asList(arr));
	System.out.println("***after converting array to arraylist "+al3);
		}

	}


