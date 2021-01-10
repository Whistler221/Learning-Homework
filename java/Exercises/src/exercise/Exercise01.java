package exercise;

import java.util.Scanner;

public class Exercise01 {
	
	// (Convert mile to kilometer) Write a program that reads a mile in a double value
	// from the console, converts it to kilometers, and displays the result. The formula
	// for the conversion is as follows: 1mi = 1.6km
	
	
	public static void main(String[] args) {	
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter miles: ");
		
		double miles = input.nextDouble();
		
		input.close();
		
		double km = miles * 1.6;
		
		System.out.printf("Miles converted into kilometers: %.2f", km);
		
		
	}
	
}