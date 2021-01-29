package zadatak2;

public abstract class Family extends Kingdom {

	private Name nameFamily;
	private String characteristics;
	
	
	public Name getNameFamily() {
		return nameFamily;
	}
	public void setNameFamily(Name nameFamily) {
		this.nameFamily = nameFamily;
	}
	public String getHabitat() {
		return characteristics;
	}
	public void setHabitat(String habitat) {
		this.characteristics = habitat;
	}
	
	
}