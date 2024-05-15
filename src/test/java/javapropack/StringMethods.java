package javapropack;

public class StringMethods {
	 static String s="this is my new mehtod"; //0 1 2
	static int getCount(char ch,int startfrom) {
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++) {
			
			int index=s.indexOf(ch,startfrom);
			if(index>=0) {
			count++;
			startfrom=index+1;
			}else {
				break;
			}
			
		}
		System.out.println("i is reapeated "+count+" times");
	
		return count;
		
		}
	
	public static void main(String[] args) {
		
	
		System.out.println(s.length()); //21
		System.out.println(s.indexOf("is")); // is - i at 2nd index of string so the value will return 2
		System.out.println(s.indexOf('m')); //8
		System.out.println(s.indexOf('m', 9)); // i want another m in given string , it means at what index you want to start and search for m
											//here i'm searching m strating from 9th index
	
	System.out.println(s.indexOf("my", 6));
	System.out.println(s.indexOf("my", 20)); //return -1 we are passing startof index as 20 after we dont have any "my";
	System.out.println(s.indexOf("my", 22)); //there is no sub string at index 22
	
	getCount('i', 0);
	}

}
