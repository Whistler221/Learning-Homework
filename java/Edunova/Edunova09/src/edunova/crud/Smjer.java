package edunova.crud;

import java.util.ArrayList;
import java.util.List;

public class Smjer {
	
	private int sifra;
	private String naziv;
	private List<Grupa> grupe=new ArrayList<>();
	
	
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public List<Grupa> getGrupe() {
		return grupe;
	}
	public void setGrupe(List<Grupa> grupe) {
		this.grupe = grupe;
	}
	
	

}