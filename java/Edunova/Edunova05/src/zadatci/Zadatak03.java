package zadatci;

import java.util.Scanner;

public class Zadatak03 {
	
	// kreirajte metodu naziv ucitajBroj tipa int
	// koja od korisnika beskonacno trazi
	// unos sve dok korisnik ne unese broj veci od 0
	// kada se to dogodi metoda tako unese vrijednost
	// vrati onome koji ju je pozvao
	
	public static void main(String[] args) {
		
		System.out.println(ucitajBroj());

	}

	static int ucitajBroj() {
		Scanner input = new Scanner(System.in);

		int broj = -1;
		
		input.close();

		while (broj < 0) {
			System.out.println("unesi broj ");
			broj = input.nextInt();
		}

		return broj;
	}
}