package edunova06;

public class E03ZivotniVijekObjekta {
	
	// 1. faza deklarirali, vrijednost je null
	private Osoba osoba;
	
	public E03ZivotniVijekObjekta() {
		System.out.println(osoba);
		
		//NullPointerExveption
		//System.out.println(osoba.getIme());
		//2. faza konstruiranje
		// poziv konstruktora
		osoba = new Osoba();// new je poziv konstruktora
		
		// 3 faza koristenja
		osoba.setIme("Pero");
		System.out.println(osoba.getIme());
		
		// 4 faza unistenje
		// mi ju ne radimo, radi ju GC (garbage collector)
	}
	
	public static void main(String[] args) {
		new E03ZivotniVijekObjekta();
	}
	
	
	
	private class Osoba{
		
		private String ime;
		// 2. faza konstruktor - specificna metoda
		public Osoba() {
			// sluzi to da prilikom kreiranja nve instance
			// programer ima priliku nesto odraditi
			
		}
		
		public String getIme() {
			return ime;
		}
		public void setIme(String ime) {
			this.ime = ime;
		}

		public Osoba(String ime) {
			super();
			this.ime = ime;
		}
		
		
	}
	
}