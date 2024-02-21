package javainterview;

public class SumofdigitsfromaNumber {
public static void main(String[] args) {
	int num=12234;
	int sum=0;
	
	while(num!=0) {//12234 1223
		sum=sum+num%10; //0+4=4 4+3=7
		num=num/10;// 12234/10=1223
	}
	System.out.println(sum);
}
}
