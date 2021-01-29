package edunova.primjer;

import java.math.BigDecimal;

public class Otpremnica extends Dokument {
	
	private String kupac;
	private BigDecimal iznos;

	@Override
	public BigDecimal getIznos() {
		return iznos;
	}

	public String getKupac() {
		return kupac;
	}

	public void setKupac(String kupac) {
		this.kupac = kupac;
	}

	public void setIznos(BigDecimal iznos) {
		this.iznos = iznos;
	}
	
	

}
