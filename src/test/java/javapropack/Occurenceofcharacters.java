package javapropack;

import java.util.HashMap;
import java.util.Map;

public class Occurenceofcharacters {
//	public static void main(String[] args) {
//		String s="sannith"; //7
//		int s1=s.replace("n", "").length();//5
//		int s2=s.length();
//		System.out.println(s1);
//		System.out.println(s2);
//		int repeatedchar=s2-s1;
//		
//		System.out.println(" n is occurred "+repeatedchar+" times");
//		

//	      String s="master blaster";
//
//	      char ch[]=s.toCharArray();
//
//	      Map<Character,Integer> m=new HashMap<Character,Integer>();
//
//	      for(Character temp:ch){
//	      if(m.containsKey(temp)){
//	      m.put(temp, m.get(temp)+1);
//	      }
//	      else{
//	      m.put(temp,1);
//	      }
//	      }
//
//	      for(Character s1:m.keySet()){
//	      System.out.println(s1+" is repeated" + m.get(s1));
//	      }
	    public static void main(String[] args){
	        String s="welcome to java program";
	       String s1[]= s.split(" ");
	       String r="";
	       for(int i=s1.length-1;i>=0;i--){
	           r=r+s1[i]+" ";
	       }
	       System.out.println(r);
	char ch[]=r.toCharArray();
	HashMap<Character,Integer> m=new HashMap<Character,Integer>();
	for(Character t:ch ){
	    if(m.containsKey(t)){
	    m.put(t,m.get(t)+1);
	}else{
	    m.put(t,1);
	}
	}
	for(Character t1:m.keySet()){
	    if(t1!=' ' && m.get(t1)>1){
	        System.out.println(t1+" is repeated :" +m.get(t1)+" times");
	    }
	}
		
	}

}
