package crud;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Auxiliary {
	
	private static final Scanner sc = new Scanner(System.in);
	private static final SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
	
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
			System.out.print(message + ": ");
			try {
				i = Integer.parseInt(sc.nextLine());
				if(i < min || i > max) {
					System.out.println("Number of input not in available range (" + min + "-" + max + ")");
					continue;
				}
				return i;
			} catch (Exception e) {
					System.out.println("Incorrect entry");
			}
		}		
	}
	
	public static String entryCheck(String message) {
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
	
	public static Date loadDate(String message) {
		while(true) {
			try {
				System.out.println(message);				
				return df.parse(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Date format incorrect");
				System.out.println("Entry example: " + df.format(new Date()));
			}
		}
	}
	
}
