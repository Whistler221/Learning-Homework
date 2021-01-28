package edunova.primjer;

import java.math.BigDecimal;


public class Start {
	
	public Start() {
		Dokument[] dokumenti = new Dokument[2];
		
		Racun racun = new Racun();
		racun.setDioRacuna1(new BigDecimal(2345.99));
		racun.setDio2(new BigDecimal(89.2377));
		
		dokumenti[0]=racun;
		
		Otpremnica otpremnica = new Otpremnica();
		otpremnica.setKupac("Edunova");
		otpremnica.setIznos(new BigDecimal(100));
		
		dokumenti[1]=otpremnica;
		
		System.out.println(dokumenti[0].getIznos() + " - " +
				dokumenti[0].getIznosPDV());
		
		System.out.println(dokumenti[1].getIznos() + " - " +
				dokumenti[1].getIznosPDV());
	}
	
	
	public static void main(String[] args) {
		new Start();
	}

}
