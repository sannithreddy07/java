package arrays;

public class ConsecutiveNumbinArray {
	public static void main(String[] args) {
		int a[]={2,4,1,5,6,7,8,9,11};
	      for(int i=0;i<a.length-1;i++){
	          if(a[i]+1==a[i+1]){
	              System.out.println("consecutive numbers in array are:  "+a[i]);
	          }
	      }
	}

}
