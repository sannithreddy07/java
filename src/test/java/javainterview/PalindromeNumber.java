package javainterview;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int org_num=num; // storing the actual value in org_num variable 1234
	int rev=0;
	
	while(num!=0) {
		
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println(rev);
	if(org_num==rev) {		//comparing the rev value with org_num
		System.out.println(org_num+" this is palindrome");
	}
	else {
		System.out.println(org_num+" Entered number is not a palindrome");
	}
	sc.close(); // to prevent from memory leak
	}

}
