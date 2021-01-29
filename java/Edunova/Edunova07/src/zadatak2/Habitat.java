package zadatak2;

public class Habitat {
	
	private String location;
	private String description;
	
	public Habitat() {
		
	}
	
	
	public Habitat(String location) {		
		this.location = location;
	}
	
	public Habitat(String location, String description) {
		this.location = location;
		this.description = description;
	}
}