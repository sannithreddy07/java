package javapropack;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
		String rev="";
		
		//String s2=s1;
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		if(s1.equals(rev)) { //string comparison 
			System.out.println(s1+" is a palindrome");
		}
		else {
			System.out.println(s1+" not a palindrome");
		}
		sc.close();
	}

}
