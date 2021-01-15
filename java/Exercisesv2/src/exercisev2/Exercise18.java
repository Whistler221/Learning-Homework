package exercisev2;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first binary number :");		
		String num1 = scan.next();
		
		System.out.println("Enter the second binary number :");
		String num2 = scan.next();
		
		scan.close();
		
		int a = Integer.parseInt(num1,2);
		
		int b = Integer.parseInt(num2,2);
		
		int result = a*b;
		
		System.out.println("The binary result is :"+Integer.toBinaryString(result));
	}
}
