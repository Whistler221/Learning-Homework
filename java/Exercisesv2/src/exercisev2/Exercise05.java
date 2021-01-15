package exercisev2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first Number: ");
		
		int num1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		
		int num2 = input.nextInt();
		
		System.out.println("Multiplication result: " + num1 * num2);
		
		input.close();
		
	}
}
