package javainterview;

public class NumberofdigitsinInteger {
	public static void main(String[] args) {
		int a=1234;
		int count=0;
		
		while(a!=0) {
			a=a/10; //1234/10=123 123/10=12 12/10=1 1/10=0 0!=0 is flase exit loop
			count++;
		}
		System.out.println(count);
	}

}
