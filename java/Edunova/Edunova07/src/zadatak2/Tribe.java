package zadatak2;

public class Tribe extends Subfamily{
	
	private Name nameTribe;
	private String characteristics;
	
	
	
	public Tribe(Name nameTribe) {
		super();
		this.nameTribe = nameTribe;
	}
	public Name getNameTribe() {
		return nameTribe;
	}
	public void setNameTribe(Name nameTribe) {
		this.nameTribe = nameTribe;
	}
	public String getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	
	public void setHabitat(Habitat habitat) {
		
		
	}
	
}