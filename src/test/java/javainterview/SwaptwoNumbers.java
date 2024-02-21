package javainterview;

public class SwaptwoNumbers {
	
	public static void main(String[] args) {
		
		
		//method 1 --- third varibale
		
		int a= 10;
		int b=20;
		
		System.out.println("Before swapping the values are "+a +" "+b);
		
//		int t=a; //assinging a value to t --10
//		a=b; //assign b value a --20
//		b=t; //assign third varibale value to b --10
		
		//method 2--- using + and -
//		
//		a=a+b; //10+20=30
//		b=a-b;	//30-20=10
//		a=a-b;	//30-10=20
		
		
		//method 3 -- using * and / -- to use this a & b should not be zero
//		
//		a=a*b; //10*20=200
//		b=a/b;	//200/20=10
//		a=a/b;		//200/10=20
		
		//method 4 -- using single statement
		
		b=a+b-(a=b); //first within the bracket (a=b) a value is replaced with b i.e a=20
						//10+20-20 =10
		
		System.out.println("After swap "+a +" "+b);
		
	}

}
