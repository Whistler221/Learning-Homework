package crud;

public class employeeInformation {
	
	private String 	name;
	private String 	lastname;
	private String 	contactInfo;
	private String 	iban;
	private double	salary;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getContactInfo() {
		return contactInfo;
	}
	
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	public String getIban() {
		return iban;
	}
	
	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}