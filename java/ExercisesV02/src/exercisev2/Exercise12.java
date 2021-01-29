package exercisev2;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");		
		int num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter third number: ");
		int num3 = input.nextInt();
		
		input.close();
		
		System.out.println((num1 + num2 + num3) / 3);
				
		
	}
}
