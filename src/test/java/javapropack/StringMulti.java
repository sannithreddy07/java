package javapropack;

public class StringMulti {
	 public static void main(String[] args) {
	      String w="this is my first interview";
	      String w1[]=w.split(" ");
	      String rsv="";
	      for(String t:w1){
	          String rs="";
	          for(int i=t.length()-1;i>=0;i--){
	              rs=rs+t.charAt(i);
	        }
	    //System.out.print(rs+" ");
	    rsv=rsv+rs+" ";
	      }
	      System.out.print(rsv+"\n");
	  String s2[]=rsv.split(" ");
	  String os="";
	  for(String t2:s2){
	      String rev2="";
	      for(int i=t2.length()-1;i>=0;i--){
	          rev2=rev2+t2.charAt(i);
	      }
	     os=os+rev2+" ";
	      }
	      System.out.print(os+"\n");
	     
	      String w2[]=os.split(" ");
	      StringBuffer sbf= new StringBuffer();
	      for(String t3:w2){
	    	String revs="";
	    	  if(t3.equals("is") || t3.equals("first")){
	    		  
	    		  for(int i=t3.length()-1;i>=0;i--) {
	    			 revs=revs+t3.charAt(i);
	    		  }
	    		  sbf.append(revs).append(" ");
	    			       		  
	          }
	              else{
  
	            	  sbf.append(t3).append(" ");
	              }
  	  
	          }
	      System.out.print(sbf);
	      
	      
}
}
