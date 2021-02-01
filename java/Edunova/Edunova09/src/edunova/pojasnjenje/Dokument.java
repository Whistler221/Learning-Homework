package edunova.pojasnjenje;

import java.util.Date;

public abstract class Dokument {
	
	private Date datumKreiranja;
	
	public Dokument() {
		this.datumKreiranja=new Date();
	}

	public Date getDatumKreiranja() {
		return datumKreiranja;
	}

	public void setDatumKreiranja(Date datumKreiranja) {
		this.datumKreiranja = datumKreiranja;
	}

	
}
