package javapropack;

import java.util.Scanner;

public class StringPermutation {
	
//static void permutation(String str, String result) {
//		
//		if(str.length()==0) {
//			System.out.println(result +" ");
//			return;
//		}
//		
//		for(int i=0;i<str.length();i++) {
//			
//			//storing char of string in ch
//			char ch=	str.charAt(i);
//			
//			
//			//storing remaining string excluding first char
//			String rest=str.substring(0, i)+str.substring(i+1);
//			
//			
//			//recursion
//			permutation(rest,result+ch);
//			
//			
//		}
//		
//		
//	}
//	public static void main(String[] args) {
//		
//		String ip="abc";
//		permutation(ip,"");
	
	static void permut(char[] ar, int fi) {
		if(fi==ar.length-1) {
			System.out.println(ar);
			return;
		}
		for(int i=fi;i<ar.length;i++) {
			swap(ar,i,fi); //a-a 
			permut(ar,fi+1); //b-a
			swap(ar,i,fi);	 //a-a	
		}
		
		
	}
	
	static void swap(char[] ar,int i, int fi) {
		char t=ar[i];
		ar[i]=ar[fi];
		ar[fi]=t;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		permut(s.toCharArray(),0);
		sc.close();
		
	}
	}



