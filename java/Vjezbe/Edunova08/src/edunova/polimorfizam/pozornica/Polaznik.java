package edunova.polimorfizam.pozornica;

import java.math.BigDecimal;

public class Polaznik extends Osoba{

	private String brojUgovora;
	
		@Override
		public String getPozdrav() {
			return "Ja sam " + getIme() + ", moj broj ugovora je "
						+ getBrojUgovora();
		}

		public String getBrojUgovora() {
			if(brojUgovora==null) {
				return "Nije postavit";
			}
			return brojUgovora;
		}

		public void setBrojUgovora(String brojUgovora) {
			this.brojUgovora = brojUgovora;
		}

		@Override
		public BigDecimal getIznos() {
			return BigDecimal.ZERO;
		}
}