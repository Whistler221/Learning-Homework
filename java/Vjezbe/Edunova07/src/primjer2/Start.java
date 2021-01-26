package primjer2;

import java.util.Date;

public class Start {
	
	public Start() {
		
		Racun racun = new Racun();
		racun.setId(Long.valueOf(1));
		racun.setDatum(new Date());
	
		Kupac kupac = new Kupac();
		kupac.setNaziv("Firma");
		
		Mjesto mjesto = new Mjesto();
		mjesto.setNaziv("Osijek");
		mjesto.setPostanskiBroj("31000");
		
		kupac.setMjesto(mjesto);
		
		racun.setKupac(kupac);
		
		System.out.println(racun.getKupac().getMjesto().getPostanskiBroj());
	}
	
	public static void main(String[] args) {
		new Start();
	}
}
