package edunova06;


// klasa je opisnik objekata

public class E01Klasa {
	
	// OOP princip Ucahurivanje ili na engleskom Encapsulation
	// klasa skiriva svoja svojstva
	// svojstvo klase  varijavla na razini klase
	private int visina;
	
	// skriveno svojstvo klasa cini dostupnim putem javnih get/set metoda
	
	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		// this je kljucna rijec kojom se obracamo razini klase
		this.visina = visina;
	}
	
	
	
}
