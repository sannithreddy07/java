package javapropack;

public class RemoveSpecialcharfromString {
	
	public static void main(String[] args) {
		
		String s="s@n#i&hr*d(y";
		int count=0;
		String wjunk="";
		String ojunk="";
		
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>=97 )&& (s.charAt(i)<=122)) { //lower case numbers 97-122
				wjunk=wjunk+s.charAt(i);
			
				
			}
	}
		System.out.println(wjunk);
		
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>=33 )&& (s.charAt(i)<=64)) { //32-64 && 91-126 or 32-126 // 
				ojunk=ojunk+s.charAt(i); 
			
				
			}
	}
		System.out.println(ojunk);
	}

}
