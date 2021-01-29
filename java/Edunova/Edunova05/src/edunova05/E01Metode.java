package edunova05;

import javax.swing.JOptionPane;

import static edunova05.E05MetodeV4.slucajniBroj;

	/**
	 * Ucenje Metoda
	 * @author filip
	 * 2021
	 */
	
public class E01Metode {

	static int naraziniklase;
	
	/**
	 * POTPIS METODE
	 * public - nacin pristupa
	 * static - moze se izvoditi bez kreiranja istance
	 * void - tip koji metoda vraca
	 * naziv metode (main)
	 * (u zagradi) lista parametara koje metoda prima. Paremetri su odvojeni zarezom
	 * @param args
	 */
	
	public static void main(String[] parametarMetode) {
		int unutarMetode=0;
		System.out.println("Hello");
	
		E02MetodaV1.odradiPosao();
		E02MetodaV1.packageScope();
		//E02MetodaV1.nijeStatic(); // nije dosputmo jer nije staticna metoda
	
		E03MetodeV2.ispisi(2, 3);
		//int i = E03MetodeV2.ispisi('c'); // ne ide
		//System.out.println(E03MetodeV2.ispisi('c')); // ne ide
		
		E04MetodeV3.zbroji(3, 3); // nije sintaksna greska ali nije dobra praksa
		
		
		//Integer.parseInt("hh");//
		
		int rez = E04MetodeV3.zbroji(7, 6); 
		System.out.println(rez);
		
		var r = E04MetodeV3.zbroji(7, 6);
		
		System.out.println(r);
		
		System.out.println(E04MetodeV3.zbroji(2, 4));
		
		// uobicajnije je 
		System.out.println(apsolutnaVrijednost(-2));
		
		// moguce je 
		System.out.println(E01Metode.apsolutnaVrijednost(1));
		
		System.out.println(slucajniBroj());
		
	}	
	
	static int apsolutnaVrijednost(int i) {
		return i*-1;
	}
	
	
	static boolean isPrime(int number,int prvaVerzija) {
		boolean prime=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				prime=false;
			}
		}
		return prime;
	}
	
	static boolean isPrime(int number,char drugaVerzija) {
		boolean prime=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				prime=false;
				break;
			}
		}
		return prime;
	}
	
	static boolean isPrime(int number,boolean najboljaVerzija) {
		if(number<2) {
			return false;
		}
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return false; // short curcuiting
			}
		}
		return true;
	}
	
	
	
	
}