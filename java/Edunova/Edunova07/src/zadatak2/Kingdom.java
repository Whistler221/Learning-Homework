package zadatak2;

public abstract class Kingdom {
	
	private Name nameKingdom;
	private String opis;
	

	public Name getNameKingdom() {
		return nameKingdom;
	}
	public void setNameKingdom(Name nameKingdom) {
		this.nameKingdom = nameKingdom;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
}