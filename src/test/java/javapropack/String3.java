package javapropack;

public class String3 {
	
	static String reversee(String s,String target1, String target2) {
		String s1[]=s.split(" ");
		StringBuffer sb=new StringBuffer();
		
		for(String t:s1) {
			String rev="";
			if(t.equals(target1) || t.equals(target2)) {
				for(int i=t.length()-1;i>=0;i--) {
					rev=rev+t.charAt(i);
				}
				  sb.append(rev).append(" ");
			
			}else {
				sb.append(t).append(" ");
			}
		}
		return sb.toString();
		
		
		
	}
	
	
public static void main(String[] args) {
    
String s3=reversee("welcome to home town village", "home", "village");
System.out.println(s3);
//String os ="welcome to home town village";
//String w2[]=os.split(" ");
//StringBuffer sbf= new StringBuffer();
//for(String t3:w2){
//	String revs="";
//	  if(t3.equals("home") || t3.equals("village")){
//		  
//		  for(int i=t3.length()-1;i>=0;i--) {
//			 revs=revs+t3.charAt(i);
//		  }
//		  sbf.append(revs).append(" ");
//			       		  
//    }
//        else{
//
//      	  sbf.append(t3).append(" ");
//        }
//
//    }
//System.out.print(sbf);

}
}
