package javapropack;

public class ReverseNumber {
	public static void main(String[] args) {
		
		int num=9876;
		
		
		//Method 1 --using alogorith
		
		int rev=0;

		while(num!=0) { //0!=0 false
			int n=num%10; // 9876%10=6 987%10=7 98%10=8	9%10=9
			rev=rev*10+n; //0*10+6 ,0+6=6  6*10+7=67 67*10+8=678 678*10+9=6789
			num=num/10;		//9876/10=987  987/10=98	98/10=9	9/10=0 //we need to eleminate the last digit now
			 
			//int rev=rev*10+num%10 ;
		}
		
		//Method 2 --- using StringBuffer reverse method
		
//		StringBuffer sbf=new StringBuffer(String.valueOf(num)); //conver the int to string
//		
//		StringBuffer rev=sbf.reverse(); // reveresed value is store in StringBuffer variable
		
		//Method 3 -- using StringBuilder append method
		
//		StringBuilder sbl=new StringBuilder();
//		sbl.append(num); // appending the value and storing in sbl object
//		StringBuilder rev=sbl.reverse(); // the value of sbl is reveresed using reverse method
		
		System.out.println(rev);
	}

}
