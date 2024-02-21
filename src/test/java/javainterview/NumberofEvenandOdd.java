package javainterview;

public class NumberofEvenandOdd {
public static void main(String[] args) {
	int num=418569;
	int ecount=0;
	int ocount=0;
	
	while(num!=0) {  //418569 41856 4185 418 41 4/10=0 is false nou come out of loop
		
		int rem=num%10; //418569%10=9  41856%10=6
		if(rem%2==0) { //9%2=1 false 6%2=0 true
			ecount++; 	//increse count and come out of condition
			
		}
		else { 			//if false increase count and come out of condition block
			ocount++;
		}
		num=num/10; //418569/10=41856 41856/10=4185 418 41 4/10=0
	}
	System.out.println("number of even is "+ecount +" number of odd is "+ocount);
	
	
}
}
