package exercisev2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("First number: ");
		
		int num1 = input.nextInt();
		
		System.out.print("Second number: ");		
		
		int num2 = input.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2 ));
		
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2 ));
		
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2 ));
		
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2 ));
		
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		
		input.close();
	}
}
