package javainterview;

public class NumberofCharactersinString {
	
	public static void main(String[] args) {
		
		String s="sannith reddy lingampelly";
		
		int count=0;
		char ch;
		
		for(int i=0;i<s.length();i++) {
		//	ch=s.charAt(i);
			if(s.charAt(i)!=' '){
			count++;
		}
		}
		System.out.println(count);
	}

}
