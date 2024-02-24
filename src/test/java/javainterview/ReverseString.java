package javainterview;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="sannith";
	
		
		String rev="";
		
		//Method 1 using concatenation
		
		int len=s.length()-1; //string	s.length()=4 but index starts from 0 , so do it -1
		
		for(int i=len;i>=0;i--) {
			rev=rev+s.charAt(i); //concatenation emptystring+h rev=h // rev= h+t // rev=ht+i // htinnas
		}
		
		
		//Method 2 -- using converting string to char array
		
//	char[] a=s.toCharArray();  // the array length will be 4 , since array index starts from index 0 , so need to do -1
//	
//	int len=a.length;
//	for(int i=len-1;i>=0;i--) {
//		rev=rev+a[i]; //a[6]=h rev=h 
//	}
	
		//Method 3 -- using StringBuffer

//	StringBuffer sbf=new StringBuffer(s); // passing the s string to sbf object
//	StringBuffer rev=sbf.reverse(); 	//reversing the sbf using reverse method
		
		//Method 3 -- using StringBuilder
	
//	StringBuilder sbl=new StringBuilder();
//	sbl.append(s); //storing the string value of s in sbl object by using append method 
//	StringBuilder rev=sbl.reverse(); //reversing the stored value of sbl using reverse method  and storing varibale rev and the return type should be StringBuilder
		System.out.println(rev);
	}
	
	

}
