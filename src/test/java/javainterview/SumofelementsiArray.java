package javainterview;

public class SumofelementsiArray {
	public static void main(String[] args) {
		 int a[]= {3,5,8,88,33,2};
		 
		 int len=a.length;
		 int sum=0;
		 
//		 for(int i=0;i<=len-1;i++) { 
//			 sum=sum+a[i]; //0+3=3 3+5=8 8+8=16 16+88=104 104+33=137 137+2=139
//		 }
		 
		 for(int temp:a) {
			 sum=sum+temp;
		 }
		 System.out.println(sum);
	}
}
