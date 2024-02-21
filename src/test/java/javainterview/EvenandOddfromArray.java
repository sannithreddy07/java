package javainterview;

public class EvenandOddfromArray {
	
	public static void main(String[] args) {
		 int a[]= {4,9,6,15,18,21};
		 int count=0;
		 int ocount=0;
		 
		 for(int i=0;i<=a.length-1;i++) {
			 if(a[i]%2==0) { //extract the number first and %2 if rem is it is even else odd
				 count++;
				 System.out.print(" "+a[i]);
			 }
		 }
		 for(int i=0;i<=a.length-1;i++) {
			 if (a[i]%2!=0){
				 ocount++;
				 System.out.print(" "+a[i]);
				 
			 }
		 }
		 System.out.println(" even count is "+count+" odd count is "+ocount);
		 
//		 for (int temp:a) {
//			 if(temp%2==0) {
//				 System.out.println(temp);
//			 }
//		 }
//		 for(int temp1:a) {
//			 if(temp1%2!=0) {
//				 System.out.println(temp1);
//			 }
//		 }
	}

}
