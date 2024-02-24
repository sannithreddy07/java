package javapropack;

public class FactorialofaNumber {
	public static void main(String[] args) {
		
		/*6!=1*2*3*4*5*6=600  //ascending 
		 * 6!=6*5*4*3*2*1 		//descending
		 */
		
		//method1 --ascending
		
		int num=6;
		int factorial=1;
		
		for(int i=1;i<=num;i++) {
			factorial=factorial*i; //1*1 1*2 2*3 6*4 24*5 120*6
		}
		
		//method 2-- descending
		
//		for(int i=num;i>=1;i--) {
//
//			factorial=factorial*i; //1*6 6*5 30*4 120*3 360*2 720*1
		
		
		System.out.println("factorila of 6! is: "+factorial);
	}

}
