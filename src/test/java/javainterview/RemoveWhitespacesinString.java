package javainterview;

public class RemoveWhitespacesinString {
	
	public static void main(String[] args) {
		String s="s ann i th";
		String wspaces="";
	
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				
				wspaces=wspaces+s.charAt(i);
			}}
				
			
		System.out.println(wspaces);
	
		}
	}



