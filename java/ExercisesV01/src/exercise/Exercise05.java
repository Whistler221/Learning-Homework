package exercise;

import java.util.Scanner;

public class Exercise05 {
	
	// (Multiply the digits in an integer) Write a program that reads an integer between
	// 0 and 1000 and multiplies all the digits in the integer. For example, if an integer
	// is 932, the multiplication of all its digits is 54.
	// Hint: Use the % operator to extract digits, and use the / operator to remove the
	// extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("enter number: ");

		int num = input.nextInt(), product = 1;

		String s = String.valueOf(num);

		if (s.length() == 1) {
			product *= num;
		} else if (s.length() == 2) {
			product = (num % 10) * ((num / 10) % 10);
		} else if (s.length() == 3) {
			product = (num % 10) * ((num / 10) % 10) * ((num / 100) % 10);
		}

		System.out.println(product);
		
		input.close();
	}
	
}
