package javainterview;

import java.util.Scanner;

public class LargestofThreenumbers {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter third number");
		int c=sc.nextInt();
		
//		if(a>b && a>c) {
//			System.out.println(a+" is largest num");
//		}else if(b>a && b>c) {
//			System.out.println(b+" is largest num");
//	}else {
//		System.out.println(c+" is largest num");
//	}
		
		int largest = c>(a>b?a:b)?c:(a>b?a:b); //18>45?18:45 //expression?true:false
		System.out.println(largest+" is largest num");
		
		sc.close();

}
}
