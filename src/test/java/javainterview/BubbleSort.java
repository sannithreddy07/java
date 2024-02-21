package javainterview;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		int a[]= {6,4,2,1,8,3};
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++) { // this for loop is for number of passes required (based on array length-1)
			for(int j=0;j<n-1;j++) { //to compare the adjacent values of array j is first element and j+1 is second
				if(a[j]>a[j+1]) {  //if first element is > second element then  
					int temp=a[j]; //store the first element  in temp variable
					a[j]=a[j+1];  // store the second element in first variable
					a[j+1]=temp;	//store the temp(first elemt) variable in second element place
				}
				
			}
		}
		System.out.println(Arrays.toString(a)); //to convert the array to string array and print
	}

}
