package edunova.polimorfizam.realizacija;

import edunova.polimorfizam.pozornica.Osoba;
import edunova.polimorfizam.pozornica.Polaznik;
import edunova.polimorfizam.pozornica.Predavac;

public class Start {
	
	public Start() {
		Osoba[] osobe = new Osoba[2];
		
		Polaznik polaznik = new Polaznik();
		polaznik.setIme("Mario");
		polaznik.setBrojUgovora("2021/55");
		osobe[0]=polaznik;
		
		Predavac predavac = new Predavac();
		predavac.setIme("Ana");
		predavac.setZiroRacun("HR5548569696");
		osobe[1]=predavac;
		
		ispisi(osobe);
		
	}
	
	private void ispisi(Osoba[] osobe) {
		for (Osoba osoba : osobe) {
			//realizacija polimorfizma
			System.out.println(osoba.getPozdrav());
			osoba.prezentirajMe();
			System.out.println(osoba.getClass());
			if(osoba instanceof Polaznik) {
				System.out.println("POLAZNIK JE");
			}
		}
	}
	
	public static void main(String[] args) {
		new Start();
	}

}