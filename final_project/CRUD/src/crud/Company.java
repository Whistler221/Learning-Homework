package crud;

public class Company {
	
	private String name;
	private String hqLocation;
	private String officeLocation;
	private int governmentRegisteredID;
	private String founderContactInfo;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public String getHqLocation() {
		return hqLocation;
	}

	public void setHqLocation(String hqLocation) {
		this.hqLocation = hqLocation;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
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