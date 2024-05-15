package javapropack;

import java.util.HashMap;
import java.util.Map;

public class OccurencesofcharinString2 {
	
	public static void main(String[] args) {
 
	
		String s="sannith reddy lingampelly";

		char ch[]=s.toCharArray();

		HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
		
		

		for(Character temp:ch){
		if(hs.containsKey(temp)){
		hs.put(temp,hs.get(temp)+1);
		}else{
		hs.put(temp,1);
		}
		}
		for(Character c:hs.keySet()){
		if(hs.get(c)>1){
		System.out.println("repeated char in string "+c+" is repeated "+hs.get(c)+" times");
		}
		}

/*        String s="go anywhere do anything with intel";
       String s1[]= s.split(" ");
       StringBuffer sb=new StringBuffer();
       for(String t:s1){
           String rev="";
          
           if(t.equals("anywhere") || t.equals("anything")){
               for(int i=t.length()-1;i>=0;i--){
                   rev=rev+t.charAt(i);
               }
               sb.append(rev).append(" ");
           }
               else{
                   sb.append(t).append(" ");
               }
           }
           String k=sb.toString();
           System.out.println(k);
           

   
       String s2[]= k.split(" ");
       StringBuffer sb1=new StringBuffer();
       for(String t1:s2){
           String rev1="";
          
           if(t1.equals("erehwyna") || t1.equals("gnihtyna")){
               for(int i=t1.length()-1;i>=0;i--){
                   rev1=rev1+t1.charAt(i);
               }
               sb1.append(rev1).append(" ");
           }
               else{
                   sb1.append(t1).append(" ");
               }
           }
           String k1=sb1.toString();
           System.out.println(k1);
           
           String rs="";
           for(int i=0;i<=k1.length()-1;i++){
       if(k1.charAt(i)!=' '){
           rs=rs+k1.charAt(i);
       }
           }
       System.out.println(rs);
       
       char ch[]=rs.toCharArray();
       
       Map<Character,Integer> mp=new HashMap<Character,Integer>();
       for(Character t:ch){
           if(mp.containsKey(t)){
               mp.put(t,mp.get(t)+1);
           }else{
               mp.put(t,1);
           }
       }
       
       for(Character t1:mp.keySet()){
           if(mp.get(t1)>1){
           System.out.println(t1 +" is repeated "+mp.get(t1) +"times");
       }
       }*/
	}
	}


