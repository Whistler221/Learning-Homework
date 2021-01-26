package primjer1;

public class Polaznik extends Osoba {

	private String brojUgovora;
	private int status;
	
	

	public Polaznik() {
		//super();
		System.out.println("konstruktor Polaznik " + status);
	}
	
	

	public Polaznik(String ime, String prezime, String brojUgovora) {
		//setIme(ime); - ovo se ne radi
		//setPrezime(prezime); - ovo se ne radi
		super(ime, prezime); // parametri od nadklase se prosljede istoj
		this.brojUgovora = brojUgovora;
	}



	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		// kada se obraćam prvoj nadklasi koristim ključnu riječ super
		super.status=1; //protected int status; iz nad klase
		this.status=2; // private int status;
		this.brojUgovora = brojUgovora;
	}
	
	
}
