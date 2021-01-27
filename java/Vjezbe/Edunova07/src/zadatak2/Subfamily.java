package zadatak2;

public abstract class Subfamily extends Family {

	private Name nameSubfamily;
	private String characteristicsGenus;
	
	
	public Name getNameSubfamily() {
		return nameSubfamily;
	}
	public void setNameSubfamily(Name nameSubfamily) {
		this.nameSubfamily = nameSubfamily;
	}
	public String getCharacteristicsGenus() {
		return characteristicsGenus;
	}
	public void setCharacteristicsGenus(String characteristicsGenus) {
		this.characteristicsGenus = characteristicsGenus;
	}
	
}