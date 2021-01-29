package edunova.primjer;

import java.math.BigDecimal;

public abstract class Dokument {
	
	public abstract BigDecimal getIznos();
	
	public BigDecimal getIznosPDV() {
		return getIznos().multiply(new BigDecimal(0.25));
	}
	
}
