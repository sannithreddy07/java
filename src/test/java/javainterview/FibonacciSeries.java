package javainterview;

public class FibonacciSeries { // sum of two preceeding number is Fibanoacci series
	
	public static void main(String[] args) {
		
		int n1=0, n2=1 , sum=0; //intialize the first two value of series 
		System.out.print(n1+" "+n2); //printing first two values
		
		for(int i=2;i<10;i++) { //loop starts from 2 , since we used 0 1
			sum=n1+n2; //0+1=1 1+1=2 1+2=3 3+2=5
			System.out.print(" "+sum); //printing sum of n1 n2
			n1=n2;		//1 1 2 3  //assign the value of n2 to n1 
			n2=sum;		//1 2 3 5	//assign the value of sum to n2 ,, so the preceeding values replaced with newer ones and add sum
		}
	}

}
