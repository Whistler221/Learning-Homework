package exercise;

import java.util.Scanner;

public class Exercise03 {
	
	// (Convert meters into feet) Write a program that reads a number in meters,
	// converts it to feet, and displays the result. One meter is 3.2786 feet.

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter meters");
	
		double m = input.nextDouble();
		
		input.close();
		
		double feet = m * 3.2808;
		
		System.out.println("value in feet is"+ feet);
		
	}
	
}
