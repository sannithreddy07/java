package javainterview;

public class Vowels { //vowels = a, e, i, o , u
	
	public static void main(String[] args) {
		String s="sannith";
		String vowels=""; //to print only vowels from string
		int count=0; //to find count of vowels in string if below condition is satisfied
		String wvowels=s.replaceAll("[aeiou]", ""); //to print without vowels
		
		for(int i=0;i<s.length();i++) {
		if((s.charAt(i)=='a') || (s.charAt(i)=='e') || (s.charAt(i)=='i')|| (s.charAt(i)=='o')|| (s.charAt(i)=='u')) {
			
			vowels=vowels+s.charAt(i);
//			count++;
//			wvowels=wvowels+s.charAt(i);
			}
		
	}
		System.out.println(vowels);
//		System.out.println(count);
//		System.out.println(wvowels);
	}

}
