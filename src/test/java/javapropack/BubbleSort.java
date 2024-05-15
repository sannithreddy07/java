package javapropack;

import java.util.Arrays;

public class BubbleSort {
	
	
	
	public static void main(String[] args) {
		
	
		
//		int a[]= {6,4,2,1,8,3};
//		
//		int n=a.length;
//		
//		for(int i=0;i<n-1;i++) { // this for loop is for number of passes required (based on array length-1)
//			for(int j=0;j<n-1;j++) { //to compare the adjacent values of array j is first element and j+1 is second
//				if(a[j]>a[j+1]) {  //if first element is > second element then  
//					int temp=a[j]; //store the first element  in temp variable
//					a[j]=a[j+1];  // store the second element in first variable
//					a[j+1]=temp;	//store the temp(first elemt) variable in second element place
//				}
//				
//			}
//		}
//		System.out.println(Arrays.toString(a)); //to convert the array to string array and print
		
		 int a[]={2,4,3,9,1,6};

		 for(int i=0;i<a.length-1;i++){
		 for(int j=0;j<a.length-1;j++){
		 if(a[j]>a[j+1]){
		 int temp=a[j];
		 a[j]=a[j+1];
		 a[j+1]=temp;
		 }
		 }
		 }
		 for(int temp:a){
		 System.out.print(temp+" ");
		     }
		 
		
	}

}
