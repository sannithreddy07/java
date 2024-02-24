package javapropack;

public class NumberofCharactersinString {
	
	public static void main(String[] args) {
		
		String s="sannith reddy lingampelly";
		
		int count=0;
		String s1="";
		//char ch;
		
//		for(int i=0;i<s.length();i++) {
//		//	ch=s.charAt(i);
//			if(s.charAt(i)!=' '){
//			count++;
//		}
//		}
//		System.out.println(count);
		
		//method 2-- want string without spaces

		for(int i=0;i<s.length();i++) {
	
			if(s.charAt(i)!=' '){
				s1=s1+s.charAt(i);
			
		}
		}
		System.out.println(s1);
	}

}
