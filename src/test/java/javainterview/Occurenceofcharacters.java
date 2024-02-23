package javainterview;

public class Occurenceofcharacters {
	public static void main(String[] args) {
		String s="sannith"; //7
		int s1=s.replace("n", "").length();//5
		int s2=s.length();
		System.out.println(s1);
		System.out.println(s2);
		int repeatedchar=s2-s1;
		
		System.out.println(" n is occurred "+repeatedchar+" times");
		
		
	}

}
