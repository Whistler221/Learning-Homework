package primjer1;

public class Predavac extends Osoba {

	private String iban;
	
	public Predavac() {
		// TODO Auto-generated constructor stub
	}

	public Predavac(String ime, String prezime, String iban) {
		super(ime, prezime);
		this.iban = iban;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
}