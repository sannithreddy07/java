package javainterview;

import java.util.Arrays;

public class MinMaxinArray {
	
	public static void main(String[] args) {
		 
		int a[]= {43,56,32,21,6,43,234,9,54};
		int max=a[0]; //first lets a[0] is max and comapre with other store the value which is more than that
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) { //if a[i] is greater than max value 43>43 56>43
				max=a[i]; //replace the max value with a[i] till loop ends 
			
		}if(a[i]<min) { //if a[i] is less than min value
			min=a[i]; //replace the min value with a[i] 
		}
		}
		
//		Arrays.sort(a);
//		System.out.println(a[0] +" "+a[a.length-1]);
		System.out.println(max +" "+min);
	}

}
