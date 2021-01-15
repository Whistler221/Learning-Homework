package exercisev2;

import java.util.Scanner;

public class Exercise13 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Width = ");
		double width = scanner.nextDouble();
		
		System.out.print("Length = ");
		double length = scanner.nextDouble();
		
		double perimeter = calculateRectanglePerimeter(length, width);
		
		double area = calculateRectangleArea(length, width);
		
		System.out.printf("Perimiter is :2 * (%.1f + %1.f)=%2f\n", length, width, perimeter);
		System.out.printf("Area is: (%.1f * %.1f) = %.2f", length, width, area);
		
		scanner.close();

	}
		
	public static double calculateRectanglePerimeter(double length, double width) {
							return (2 * (length + width));
	}
	
	public static double calculateRectangleArea(double length, double width) {
							return (length * width);
								
	}
	}