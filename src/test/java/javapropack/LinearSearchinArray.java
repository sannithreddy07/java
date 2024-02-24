package javapropack;

public class LinearSearchinArray {
	
	public static void main(String[] args) {
		
		int a[]= {45,5,8,9,34,23};
		
		int search_element=8; //i want to get the position of 9 in array
		
		//boolean flag=false;
		int count=0;
		for (int i=0;i<a.length;i++) {
			if(a[i]==search_element) {
				System.out.println("element found");
				System.out.println("element is at "+i+" index");
				//flag=true; //once the element is found i'm changing the flag=true
			count++;
				break;
			}
		}
		//if(flag==false) { //if element is not in array return default value of boolean variable
		if(count==0) 	
		System.out.println("no element found in array");
		}
	}

//}
