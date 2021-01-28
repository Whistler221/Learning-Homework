package edunova.polimorfizam.pozornica;

import java.math.BigDecimal;

public class Predavac extends Osoba {
	
	private String ziroRacun;
	
	@Override
	public String getPozdrav() {
		StringBuilder sb = new StringBuilder();
		sb.append("ja sam ");
		sb.append(getIme());
		sb.append(", moj ziro racun je");
		sb.append(getZiroRacun());
		return sb.toString();
		
	}

	public String getZiroRacun() {
		return ziroRacun;
	}

	public void setZiroRacun(String ziroRacun) {
		this.ziroRacun = ziroRacun;
	}

	@Override
	public BigDecimal getIznos() {
	BigDecimal broj = new BigDecimal(0); // DZ prouciti rad s BigDecimal
	broj=broj.add(BigDecimal.ONE);
	return broj;
	}
	
}