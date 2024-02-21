package javainterview;

import java.util.Random;

public class Randomnumbers {
	
	public static void main(String[] args) {
		
		//Method 1 --using Random class
		
		Random rand=new Random(); // to print random number use Random class from util package
	int	randomnumber=rand.nextInt(10); //use this method to print random numbers within given range 10
	System.out.println(randomnumber);
	
	//Method 2--using Math calss if you want to print in decimals
	
//	double random=Math.random();  //Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0
//	System.out.println(random);
	
	
	//Method 3 --using commons.io jar package  
	
	//RandomStringUtils.randomNumeric(10) //randomnumbers to store string
	
	////RandomStringUtils.randomAplhabetic(10) //random alphabets
	
	}

}
