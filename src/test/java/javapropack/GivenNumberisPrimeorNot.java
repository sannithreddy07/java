package javapropack;

import java.util.Scanner;

/* number should be greater > 1
 * number should be divisible by 1 and itself 
 * ex: 19 = 1 and 19 it means factors should be 2 only

 */

public class GivenNumberisPrimeorNot {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int factor=0;
		
		if(num>1) {  //num be greater than 1
			for(int i=1;i<=num;i++) { //if num > 1 follow this loop and divisible by 1 and itself and increase count it becomes 2
				if(num%i==0) {
					factor++; //count is 2  
				}
			}
			if(factor==2) { //factors are 2
				System.out.println("this is a prime number");
			}
			else {
				System.out.println("not a prime number");
			}
		}else {
			System.out.println("not a prime number");
		}
		sc.close();
	}

}
