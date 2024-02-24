package javapropack;

public class NumberofwordinString {
	
	public static void main(String[] args) {
		String s="hello gemini aish";
		int count=1; //take count as 1 bcz starting of string we dont have any space
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println("total num of words are "+count);
		//System.out.println(s.length());
	}

}
