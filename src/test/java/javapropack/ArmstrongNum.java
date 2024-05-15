package javapropack;

public class ArmstrongNum {
	public static void main(String[] args) {
		int num=371;
		int enumb=num;
		double result=0;
		while(num!=0){
		   int rem= num%10;
		    result=result+Math.pow(rem,3);
		   num=num/10;
		}
		if(result==enumb){
		    System.out.println("this is a armstrong number");
		}
	}

}
