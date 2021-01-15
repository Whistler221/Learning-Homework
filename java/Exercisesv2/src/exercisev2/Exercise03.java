package exercisev2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		
		int a = input.nextInt();
		
		System.out.print("Enter the second number: ");
		
		int b = input.nextInt();
		
		int d = a/b;
		
		System.out.println();
		
		System.out.print("Result: " + d);
				
		input.close();

	}

}
