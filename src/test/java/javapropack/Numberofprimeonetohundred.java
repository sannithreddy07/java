package javapropack;

public class Numberofprimeonetohundred {
	public static void main(String[] args) {
		
	
		int i,j;
		   int count1=0;
		for(i=1;i<=100;i++){ 
		    int count=0; //since the factor of prime number is 1 and itself
		 
		    for(j=1;j<=i;j++){ //divide the i value by another loop so that we can get weather the i value is prime or not 
		        if(i%j==0){ //1%1= 0 j++(2) 2<=1 is false come out of loop i++
		            count++;    //1
		    }
		    }
		    if(count==2){ //since the factor of prime number is 1 and itself so count should be 2
		    	count1++; //to find number of prime numbers in 1to 100 =25
		        System.out.print(i+" "); //2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
		       
		    }
		}System.out.println();
		 System.out.println(count1);
		            
		          
		      }

		    }

