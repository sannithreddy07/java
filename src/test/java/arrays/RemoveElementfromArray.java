package arrays;

public class RemoveElementfromArray {
	public static void main(String[] args) {
		
	
	 int a[]={2,4,6,1,7,8,9};
	  int a1[]=new int[a.length-1];
	  int index=0;
	  for(int i=0;i<a.length;i++){
	      if(a[i]!=7){
	      //    continue;
	         a1[index]=a[i];
	         index++;
	      }
	  }
	  for(Integer t:a1){
	      System.out.println(t);
	  }
}
}
