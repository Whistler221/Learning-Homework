package exercise;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// (Sort three integers) Write a program that prompts the user to enter three
		// integers and display the integers in increasing order.

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three integers: ");

		int first = input.nextInt(), second = input.nextInt(), third = input.nextInt();

		if (first <= second && first <= third) {
			if (second <= third) {
				System.out.printf("Numbers ordered are given by: %d, %d, %d.", first, second, third);
			} else {
				System.out.printf("Numbers ordered are given by: %d, %d, %d.", first, third, second);
			}
		} else if (second <= first && second <= third) {
			if (first <= third) {
				System.out.printf("Numbers ordered are given by: %d, %d, %d.", second, first, third);
			} else {
				System.out.printf("Numbers ordered are given by: %d, %d, %d.", second, third, first);
			}
		} else if (third <= first && third <= second) {
			if (first <= second) {
				System.out.printf("Numbers ordered are given by: %d, %d, %d.", third, first, second);
			} else {
				System.out.printf("Numbers ordered are given by: %d, %d, %d.", third, second, first);
			}
		}

		input.close();
		
	}
}