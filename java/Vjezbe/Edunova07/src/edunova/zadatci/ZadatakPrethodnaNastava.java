package edunova.zadatci;

public class ZadatakPrethodnaNastava {
	
	// Kreirajte privatnu unutarnju klasu u ovoj klasi
	// koja se zove Dokument i ima 4 svojstva različitih tipova podataka
	// definirajte tri različita konstruktora
	// u main metodi ove klase napravite niz Dokumenata
	// u koji ćete postaviti 3 instance s popunjenim vrijednostima
	// stvojstava
	
	public ZadatakPrethodnaNastava() {
		
		Dokument[] doc = new Dokument[3];
		
		for(int i = 0; i < doc.length; i++) {
			doc[i] = new Dokument(i, 'a');
		}
	}	
	
	public static void main(String[] args) {
		
		new ZadatakPrethodnaNastava();
		
	}
	
	class Dokument {
		private int id;
		private char oznaka;
		private boolean stanje;
		private double podatak;
		
		public Dokument() {
			this(2,'a');
		}
		
		public Dokument(int id, char oznaka) {
			this.id = id;
			this.oznaka=oznaka;
		}
		
		public Dokument(int id, char oznaka, double podatak) {
			this.id = id;
			this.oznaka=oznaka;
			this.podatak=podatak;
		}
	}
	
	void posao() {
		@SuppressWarnings("unused")
		int i=ucitaj("Unesi");
	}

	private int ucitaj(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}