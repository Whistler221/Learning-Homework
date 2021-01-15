package exercisev2;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		String b1, b2;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter 1st binary number: ") ;
		b1 = scanner.next();
		
		System.out.print("Enter 2nd binary number: ") ;
		b2 = scanner.next();
		
		int n1 = Integer.parseInt(b1, 2);
		
		int n2 = Integer.parseInt(b2, 2);
		
		int sum = n1 + n2;
		
		String result = Integer.toBinaryString(sum);
		
		System.out.println("Sum of two binary numbers: " + result);

		scanner.close();
		
	}
}
