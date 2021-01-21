package edunova.zadaci;

public class Osoba {
	
	// OOP principom učahurivanja opiši osobu s 3 svojstva
	// sva tri su primitivnih tipova podataka
	
	private int masa;
	private int visina;
	private int godine;
	
	public int getMasa() {
		return masa;
	}
	public void setMasa(int masa) {
		this.masa = masa;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	
	public static void main(String[] args) {
		
		Osoba os = new Osoba();
		os.setVisina(180);
		os.setMasa(100);
		os.setGodine(26);
	}
}
