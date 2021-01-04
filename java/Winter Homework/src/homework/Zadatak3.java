package homework;


	/*
	 * When ever a whole number is devidable by another whole number lower than the one you are looking at 
	 * And it equals a non decimal number is not a prime number.
	 * 
	 * While number "n" is smaller than "n_check"
	 * if "n" devided by "n_ckeck" equals whole number
	 * "n" is not prime
	 * 
	 * while loop
	 * 
	 */

public class Zadatak3 {

	public static void main(String[] args) {	
	
	int i = 2; int number = 2; int count = 0; {
	
	System.out.println( " Prime Numbers from 1 to 100 are : ");	{
	while(number<=100)
	{
		count = 0;
		i = 2;
	    while(i <= number/2 )
	    {
	    	if(number % i == 0)
	    	{
	    		count++;
	    		break;
	    	}
	    	i++;
	    }
	    if(count == 0 && number != 1 )
	    {
	    	System.out.print(number + " ");
	    }
	    number++;
	    }
	}
	}
}
}	