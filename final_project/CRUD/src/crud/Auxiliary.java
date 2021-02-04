package crud;

import java.util.Scanner;

public class Auxiliary {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static int inputNumber(String message) {
		int i;
		while(true) {
			System.out.println(message + ": ");
			try {
				i = Integer.parseInt(sc.nextLine());
				
				return i;
			} catch (Exception e) {
				System.out.println("Incorrect entry");
			}
		}
	}
	
	
	public static int inputNumber(String message, int min, int max) {
		
		int i;
		while(true) {
			System.out.println(message + ": ");
			try {
				i = Integer.parseInt(sc.nextLine());
				if(i < min || i > max) {
					System.out.println("Number of input not in available range,"
							+ "available input range is from" + min + ", to" + max + ".");
					continue;
				}
				return i;
			} catch (Exception e) {
					System.out.println("Incorrect entry");
			}
		}		
	}
	
	public static String inputString(String message) {
		String s;
		while(true) {
			System.out.println(message + ": ");
			s = sc.nextLine();
			if(s.trim().isEmpty()) {
				System.out.println("Entry is mandatory!");
				continue;				
			}
			return s;
		}
	}

}
