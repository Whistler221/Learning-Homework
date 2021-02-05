package crud;

public class Company {
	
	private String name;
	private String HQ_location;
	private String OfficeLocation;
	private int governmentRegisteredID;
	private String founderContactInfo;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHQ_location() {
		return HQ_location;
	}
	
	public void setHQ_location(String hQ_location) {
		HQ_location = hQ_location;
	}
	
	public String getOfficeLocation() {
		return OfficeLocation;
	}
	
	public void setOfficeLocation(String officeLocation) {
		OfficeLocation = officeLocation;
	}
	
	public int getGovernmentRegisteredID() {
		return governmentRegisteredID;
	}
	
	public void setGovernmentRegisteredID(int governmentRegisteredID) {
		this.governmentRegisteredID = governmentRegisteredID;
	}
	
	public String getFounderContactInfo() {
		return founderContactInfo;
	}
	
	public void setFounderContactInfo(String founderContactInfo) {
		this.founderContactInfo = founderContactInfo;
	}


		
}