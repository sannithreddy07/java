package arrays;

public class JaggedArray {
	
	public static void main(String[] args) {
		int[][] jd=new int[3][];
		jd[0]=new int[] {1,2};
		jd[1]=new int[] {2,3,4,5};
		jd[2]=new int[] {2};
		int size=0;
		for(int i=0;i<jd.length;i++) {
			size +=jd[i].length;
			for(int j=0;j<jd[i].length;j++) {
				System.out.print(jd[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(size);
	}

}
