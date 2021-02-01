package edunova.liste;

public class Osoba {
	
	private String ime ;
	private String prezime;

	@Override
	public String toString() {
		return this.getIme();
	}

	public Osoba(String ime) {
		super();
		this.ime=ime;
	}
	
	public Osoba(String ime,String prezime) {
		super();
		this.ime=ime;
		this.prezime=prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime=ime;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		return true;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
}