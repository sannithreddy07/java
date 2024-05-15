package arrays;

public class TwoDimensionArray {
	public static void main(String[] args) {
		int[][] a= {{1,2},{2,3}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] b=new int[][] {{2,3},{4,6}};
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] c=new int[3][5];
		c[0][0]=1;
		c[0][1]=3;
		c[0][2]=2;
		c[0][3]=4;
		c[0][4]=5;
		

		c[1][0]=1;
		c[1][1]=3;
		c[1][2]=2;
		c[1][3]=4;
		c[1][4]=5;
		
		
		c[2][0]=1;
		c[2][1]=3;
		c[2][2]=2;
		c[2][3]=4;
		c[2][4]=7;
		
		int size=c.length; //to get no of row size
		
		System.out.println(size); 
		int size1=0;
		for(int i=0;i<c.length;i++) {
			size1 +=c[i].length; //to get size of each row (nothing but it gives how many coloumns)
				
			}
		System.out.println(size1);
		
		int[][] d=new int[3][2];
		d[0]=new int[] {1,2};
		d[1]=new int[] {2,3};
		d[2]=new int[] {3,1};
		int len=d.length;
		System.out.println(len);
		
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
