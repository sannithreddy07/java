package javapropack;

import java.util.HashSet;

public class DuplicatesinArray {
	public static void main(String[] args) {
		
		String a[]= {"sai", "shyam","ram","jam","sri","si"};
		
//		boolean flag=false;
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) { 	//comparing i=0 value with remainig string in array
//			 if(a[i]==a[j]) {
//				 System.out.println("Duplicate element is : "+a[i]);
//				 flag=true ; //since it will find duplicate then flag value will be changed to true, 
//				 				//if none of the elemnt is not found duplicate then, default value will be returened
//			 }
//			}
//		}
//		if(flag==false) {
//			System.out.println("no duplicate found");
//		}
		
	//	method 2  -- using HashSet Collection (it will not accept the duplicates , it fectches only unique values
		
		//here it will return true/false , if a duplicate string is found it will false for that string
		
		HashSet <String>data=new HashSet();
//		System.out.println(data.add("sai"));
//		System.out.println(data.add("ram"));
//		System.out.println(data.add("sai"));
	
	//	boolean flag1=false; //defining one boolean variable with false as default
		int count=0;
		for(String temp:a) {
		if(data.add(temp)==false) { //since we have duplicates the hashset will return false so compare with false
			System.out.println("duplicate found");
			//flag1=true;  //once the duplicate value is identified change the flag1=true ,  come out of loop and print the result
				count++;		
		}
		
		
		}
		//if(flag1==false) { //after the loop , if no duplicate found the flag1 value will return the default value false and print the result
			
			if(count==0) 
				System.out.println("no duplicate element found");
	}

}
//}
