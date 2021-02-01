package edunova.liste;

import java.util.ArrayList;
import java.util.List;

public class Start {
	
	public Start() {
		// imam prostora za pohranu samo 2 stringa, na 3 puca
//		String[] imena = new String[2];
//		imena[0]="Ana";
//		imena[1]="Marin";
//		imena[2]="Karlo";
		
		//imena.add, imena.push - ne postoje ove metode
		
		// ČITATI
		// https://www.java67.com/2013/08/ata-structures-in-java-programming-array-linked-list-map-set-stack-queue.html
		
		
		//loše
		ArrayList lista = new ArrayList();
		lista.add(new Osoba("Ana"));
		lista.add(new Osoba("Ana","Brekalo"));
		lista.add(new Osoba("Karlo"));
		lista.add("Pero");
		
		System.out.println(lista.get(0));
		
		System.out.println(lista.get(1));
		
		System.out.println(lista.get(0).equals(lista.get(1)));
		
		
		// BEST PRACTICE
		// korištenje generičkih klasa
		//s lijeve strane dolazi sučelje a s desne dolazi implementacija
		List<Osoba> l = new ArrayList<>();
		l.add(new Osoba("Ana"));
		l.add(new Osoba("Ana","Brekalo"));
		
		System.out.println(l.get(0).getPrezime());
		
		//https://dzone.com/articles/arraylist-vs-linkedlist-vs
		
	}

	public static void main(String[] args) {
		new Start();
	}
	
}