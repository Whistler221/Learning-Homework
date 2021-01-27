package zadatak2;

public class Kind {
	

	private Name nameKind;
	private String characteristicsType;
	

	
	public Kind() {
		super();		
	}


	public Kind(Name nameKind) {
		super();
		this.nameKind = nameKind;		
	}



	public Kind(Name nameKind, String characteristicsType) {
		super();
		this.nameKind = nameKind;
		this.characteristicsType = characteristicsType;
	}


	public void setNameKind(Name nameKind) {
		this.nameKind = nameKind;
	}
	public String getCharacteristicsType() {
		return characteristicsType;
	}
	public void setCharacteristicsType(String characteristicsType) {
		this.characteristicsType = characteristicsType;
	}


	public void setNameKingdom(Name name) {
		// TODO Auto-generated method stub
		
	}


	public Name getNameKind() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
