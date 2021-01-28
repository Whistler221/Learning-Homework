package edunova.primjer;

import java.math.BigDecimal;

public class Racun extends Dokument {

	private BigDecimal dioRacuna1;
	private BigDecimal dio2;
	
	
	@Override
	public BigDecimal getIznos() {
		return dio2.multiply(dioRacuna1).divide(new BigDecimal(2));
	}


	public BigDecimal getDioRacuna1() {
		return dioRacuna1;
	}


	public void setDioRacuna1(BigDecimal dioRacuna1) {
		this.dioRacuna1 = dioRacuna1;
	}


	public BigDecimal getDio2() {
		return dio2;
	}


	public void setDio2(BigDecimal dio2) {
		this.dio2 = dio2;
	}
	
	

	
}
