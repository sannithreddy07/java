package javapropack;

public class MissingNumberinArray {
	
	
//to perform this missing number program 
	//first there should not be any repeated numbers in it
	//you can arrange the numbers in any order 
	//And the numbers should be in proper range ex: (2,1,5,3) it is 1-5
	
	//first get sum1 of array elements 
	//second get sum2 of range of elements ex; from below the range is 1-5 so using for loop add numbers from 1-5
	
	public static void main(String[] args) {
		int a[]= {2,1,5,3};
		int	sum2=0;
		int sum1=0;
		for(int i=0;i<a.length;i++) {
		sum1=sum1+a[i]; // 0+2 2+1 3+5 8+3 first get sum1 of array elements 
		
	}
		for(int i=1;i<=5;i++) {
		sum2=sum2+i;
		}
		System.out.println("missing number in given array is : "+(sum2-sum1));
}
}
