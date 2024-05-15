package arrays;

public class SecondlargestWithoutSorting {
	public static void main(String[] args) {
		int largest=Integer.MIN_VALUE;
		int seclargest=Integer.MIN_VALUE;
		int a[]= {3,7,8,9,20,15,12};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {  //3>min 7>3 8>7 9>8 20>9 15>20(F) 12>20
				seclargest=largest;
				largest=a[i]; // 3 7 8 9 20
			}else if(a[i]>seclargest && a[i]!=largest) { //15>min && 15!=20(T) 12>15 && 12!=20 (T & F=F)
				seclargest=a[i]; //15
			}
		}
		System.out.println(seclargest);
	}

}
