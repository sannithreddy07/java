package javainterview;

import java.util.Arrays;

public class Arrayscomparision {
	
	public static void main(String[] args) {
		 int a1[]= {2,3,4,5,6};
		 int a2[]= {2,3,4,7,6};
		 
		 //method 1-- using Arrays.equal method 
		 //assuming both are equal
//		 if(Arrays.equals(a1, a2)) {
//			 System.out.println("both arrays are equal");
//		 }else {
//			 System.out.println("both arrays are not equal");
//		 }
		 
		 //method2-- assuming not equal
		 
		boolean status =true; //define one bolean variable and default value is true
		
		 if(a1.length==a2.length) {   //comparing the length is equal or not , if equal go to loop 
			 for(int i=0;i<a1.length;i++) { //comparing each elements from both the arrays
				 if(a1[i]!=a2[i]) { //compare each element if match each element
					status=false; // Now chnaging the status variable as false ,
	
				 }
			 }
			 
		 }
		 else {
			 status =false;
			System.out.println("length is not same");
		 }
	if(status==true) { //if still status is true from loop
			
		 System.out.println("both are  equal");
		 }
			else {
			 System.out.println("both are not equal"); 
		 }
	}

}
