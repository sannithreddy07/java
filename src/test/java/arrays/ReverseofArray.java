package arrays;

public class ReverseofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]={'a','v','f','k','r'};
		//char c=' ';
		int index=0;
		char ch1[]=new char[ch.length];
		for(int i=ch.length-1;i>=0;i--){
		    ch1[index]=ch[i];
		    index++;
		}
		for(Character t:ch1){
		    System.out.print(t+" ");
		}

	}

}
