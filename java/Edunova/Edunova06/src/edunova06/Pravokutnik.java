package edunova06;

public class Pravokutnik {
	
	private String naziv;
	private int duzina;
	private int sirina;
	private Mjesto mjesto;
	

	// prazni konstruktor
	public Pravokutnik() {
		super();
	}
	
	// puni konstruktor
	public Pravokutnik(String naziv, int duzina, int sirina) {
		super();
		this.naziv = naziv;
		this.duzina = duzina;
		this.sirina = sirina;
	}
		
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getDuzina() {
		return duzina;
	}
	public void setDuzina(int duzina) {
		this.duzina = duzina;
	}
	public int getSirina() {
		return sirina;
	}
	public void setSirina(int sirina) {
		this.sirina = sirina;
	}
	
	public int opseg() {
		return (this.duzina*2) + (this.sirina*2);
	}

	public Mjesto getMjesto() {
		return mjesto;
	}

	public void setMjesto(Mjesto mjesto) {
		this.mjesto = mjesto;
	}

}
