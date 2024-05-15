package javapropack;

public class SubString2 {
	
	//reverse of string without using for loop

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="welcome";
		String s2="home";
		String s3="gate";
		s1=s1+s2+s3;
		s3=s1.substring(0,s1.length()-s2.length()-s3.length());
		s1=s1.substring(s3.length()+s2.length());
		System.out.println(s1+" "+s2+" "+s3);

	}

}
