package javapropack;

public class NumerictoChar {

	
		static void convertNumToChar(String s) {

			for(int i =0; i < s.length(); i++) { //0 1 2 3
			if(Character.isAlphabetic(s.charAt(i))){ //true f t f
			System.out.print(s.charAt(i)); //aabbb
			}else {
			int a = Character.getNumericValue(s.charAt(i));//2 3
			for(int j =1; j <a; j++) { //1<3 2<3
			System.out.print(s.charAt(i-1)); //1-1=0 a , 3-1=2 bb
			}
			}
			}

			}

			public static void main(String[] args) {

			String str = "a2b3c4"; //output = aabbbcccc
			convertNumToChar(str);

			}

			

	}


