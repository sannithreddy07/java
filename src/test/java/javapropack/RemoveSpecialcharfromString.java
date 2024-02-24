package javapropack;

public class RemoveSpecialcharfromString {
	
	public static void main(String[] args) {
		
		String s="s@n#i&hr*d(y";
		int count=0;
		String wjunk="";
		
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>=97 )&& (s.charAt(i)<=122)) {
				wjunk=wjunk+s.charAt(i);
			
				
			}
	}
		System.out.println(wjunk);
	}

}
