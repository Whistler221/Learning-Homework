package zadatci;

import java.util.Scanner;

public class Zadatak02 {

	// Program unosi 2 broja od korisnika
	// Program ispisije razliku kao rezultat izvodjenja 
	// metode koja prima 2 paremetra i tipa je float
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi 2 broja: ");
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		
		input.close();
		
		System.out.println(Zadatak02.razlika(a, b));
	}
	
	public static float razlika(float a, float b) {
		return a - b;
		
	}
}
