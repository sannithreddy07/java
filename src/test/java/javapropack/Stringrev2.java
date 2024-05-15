package javapropack;

public class Stringrev2 {
	

	public static void main(String[] args) {
		
		String s="hi welcome to java";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals("welcome")) {
				String t=s1[i];
			StringBuffer sb=new StringBuffer(t);
			System.out.print(sb.reverse());
			break;
		}
		
	}
		System.out.println();
		for(String t1:s1) {
			StringBuffer sb1=new StringBuffer(t1);
			System.out.print(sb1.reverse()+" ");
		}

}
}
