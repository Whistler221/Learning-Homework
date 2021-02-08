package crud;


import java.util.ArrayList;
import java.util.List;

public class Start {

	private List<Company> companies;
	private List<Project> projects;
	private List<employeeInformation> employeeInformations;
	
	public Start() {
		
		companies = new ArrayList<>();
		JsonHandler.loadCompanies(companies);
		projects = new ArrayList<>();
		JsonHandler.loadProjects(projects);
		employeeInformations = new ArrayList<>();
		JsonHandler.loadEmployeeInfo(employeeInformations);
		Menu();
	}

	private void Menu() {

		System.out.println("------------Company Crud------------");
		auxiliaryMenu();
		switch (Auxiliary.inputNumber("Select an action", 1, 5)) {
		
		case 1:		
		companyMenu();
		break;
		
		case 2:
		projectMenu();
		break;
		
		case 3:
		employeeInfoMenu();
		
		case 5:
		System.out.println("Exit");
		break;
				
		}		
	}
	
	private void auxiliaryMenu() {
		
		System.out.println("1. Company Menu");
		System.out.println("2. Project Menu");
		System.out.println("3. Employe info Menu");
		System.out.println("4. Exit");
		
	}
	
	private void companyMenu() {
		
		System.out.println("-----------Company Menu-----------");
		CompanyMenu();
		switch (Auxiliary.inputNumber("Chose path", 1, 5)) {
		
		case 1:
			listCompany();
			break;
		
		case 2:
			inputNewCompany();
			break;
			
		case 3:
			changeCompany();
			break;
						
		case 5:
			Menu();
				
		}	
	}

	private void listCompany() {
		allCompanies();
		companyMenu();
    }
		
	private void inputNewCompany() {
		
		Company c = new Company();
        c.setName(Auxiliary.entryCheck("Input Company name: "));
        c.setHQ_location(Auxiliary.entryCheck("Input HQ Location: "));
        c.setOfficeLocation(Auxiliary.entryCheck("Input Office location: "));
        c.setGovernmentRegisteredID(Auxiliary.inputNumber("Input G.R.ID: "));
        c.setFounderContactInfo(Auxiliary.entryCheck("Input Founders contact info: "));
        companies.add(c);
        JsonHandler.saveCompanies(companies);
        companyMenu();
	}
	
	private void changeCompany() {
		allCompanies();
		int choice = Auxiliary.inputNumber("Chose option", 1, companies.size())-1;		
		var c=companies.get(choice);
		
		c.setName(Auxiliary.entryCheck("Name (" + c.getName() + ")"));
		c.setHQ_location(Auxiliary.entryCheck("HQ location (" + c.getHQ_location() + ")"));
		c.setOfficeLocation(Auxiliary.entryCheck("Offic location (" + c.getOfficeLocation() + ")"));
		c.setGovernmentRegisteredID(Auxiliary.inputNumber("G.R.ID (" + c.getGovernmentRegisteredID() + ")"));
		c.setFounderContactInfo(Auxiliary.entryCheck("Founders info (" + c.getFounderContactInfo() + ")"));
		companies.set(choice, c);
		JsonHandler.saveCompanies(companies);
		CompanyMenu();
			
	}
		
	private void allCompanies() {
		System.out.println("---------------------");
		for (int i=0; i<companies.size(); i++) {
			var c = companies.get(i);
			System.out.println((i+1) + " Company Name: " + c.getName());
			//System.out.println((i+2) + " HQ location: " + c.getHQ_location());
			//System.out.println((i+3) + " Office location: " + c.getOfficeLocation());
			//System.out.println((i+4) + " G.R.ID: " + c.getGovernmentRegisteredID());
			//System.out.println((i+5) + " Founders contact: " + c.getFounderContactInfo());
		}
		System.out.println("---------------------");
	}

	private void CompanyMenu() {
				System.out.println("1. List all of the Companies");
				System.out.println("2. Input new Company");
				System.out.println("3. Change Company");
				System.out.println("4. Work in progres");
				System.out.println("5. Exit to main menu");
	}	

	private void projectMenu() {
		
		System.out.println("------------Project Menu------------");
		optionsProjectMenu();
		switch (Auxiliary.inputNumber("Chose path", 1, 5)) {
		
		case 1:
			listProjects();
			break;
			
		case 2:
			inputNewProject();
			break;
			
		case 3:
			changeProject();
			break;
			
		case 5:
			Menu();
			
		}		
		
	}		

	private void listProjects() {
		allProjects();
		projectMenu();
    }
	
	private void inputNewProject() {
		Project p = new Project();
		p.setName(Auxiliary.entryCheck("Input Project name: "));
		p.setLocation(Auxiliary.entryCheck("Input Project location"));
		p.setCost(Auxiliary.inputNumber("Input Project cost"));
		projects.add(p);
		JsonHandler.saveProjects(projects);
		projectMenu();		
	}
	
	private void changeProject() {
		allProjects();
		int choice = Auxiliary.inputNumber("Chose option", 1, projects.size())-1;
		var p=projects.get(choice);
		
		p.setName(Auxiliary.entryCheck("Name (" + p.getName() + ")"));
		p.setLocation(Auxiliary.entryCheck("Location (" + p.getLocation() + ")"));
		p.setCost(Auxiliary.inputNumber("Cost (" + p.getCost() + ")"));
		projects.set(choice, p);
		JsonHandler.saveProjects(projects);
		projectMenu();		
	}

	private void allProjects() {
		System.out.println("---------------------");
		for (int i=0; i<projects.size(); i++) {
			var p = projects.get(i);
			System.out.println((i + 1) + " Project name: " + p.getName());
			//System.out.println((i + 1) + " Project location: " + p.getLocation());
			//System.out.println((i + 1) + " Project cost: " + p.getCost());
		}
		System.out.println("---------------------");		
	}

	private void optionsProjectMenu() {		
				System.out.println("1. List all of the Projects");
				System.out.println("2. Input new Project");
				System.out.println("3. Change Project");
				System.out.println("4. Work in progres");
				System.out.println("5. Exit to main menu");	
	}

	private void employeeInfoMenu() {
		
		System.out.println("------------Employee Information Menu------------");
		employeeInfoOptions();
		switch (Auxiliary.inputNumber("Chose path", 1, 5)) {
		case 1:
			listEmployeeInfo();
			break;
			
		case 2:
			inputNewEmployeeInfo();
			break;
			
		case 3:
			changeEmployeeInfo();
			break;
			
		case 5:
			Menu();
		}		
	}
	
	private void listEmployeeInfo() { 
		allEmployees();		
		employeeInfoMenu();
	}
	
	private void inputNewEmployeeInfo() {
		
		employeeInformation e = new employeeInformation();
		e.setName(Auxiliary.entryCheck("Input Employee name: "));
		e.setLastname(Auxiliary.entryCheck("Input Employee lastname: "));
		e.setContactInfo(Auxiliary.entryCheck("Input Employee contact info: "));
		e.setIban(Auxiliary.entryCheck("Input Employee Iban"));
		e.setSalary(Auxiliary.inputNumber("Input Employee salary"));
		employeeInformations.add(e);
		JsonHandler.saveEmployeeInfo(employeeInformations);
		employeeInfoMenu();
	}
	
	private void changeEmployeeInfo() {
		allEmployees();
		int choice = Auxiliary.inputNumber("Chose option", 1, employeeInformations.size())-1;
		var e=employeeInformations.get(choice);
		
		e.setName(Auxiliary.entryCheck("Name (" + e.getName() + ")"));
		e.setLastname(Auxiliary.entryCheck("Last name (" + e.getLastname() + ")"));
		e.setContactInfo(Auxiliary.entryCheck("Contact info (" + e.getContactInfo() + ")"));
		e.setIban(Auxiliary.entryCheck("Iban (" + e.getIban() + ")"));
		e.setSalary(Auxiliary.inputNumber("Salary (" + e.getSalary() + ")"));
		employeeInformations.set(choice, e);
		JsonHandler.saveEmployeeInfo(employeeInformations);
		employeeInfoMenu();
	}
	
	private void allEmployees() {
		System.out.println("---------------------");
		for (int i=0; i<employeeInformations.size(); i++) {
			var e = employeeInformations.get(i);
			System.out.println((i+1) + " . " + e.getName());
			System.out.println((i+1) + " . " + e.getLastname());
			System.out.println((i+1) + " . " + e.getContactInfo());
			System.out.println((i+1) + " . " + e.getIban());
			System.out.println((i+1) + " . " + e.getSalary());
		}
		System.out.println("---------------------");
	}

	private void employeeInfoOptions() {
				System.out.println("1. List all of the Employee info");
				//System.out.println("2. Input new Employee info");
				//System.out.println("3. Chane Employee info");
				//System.out.println("4. Work in progres");
				//System.out.println("5. Exit to main menu");	
	}	
	
	public static void main(String[] args) {
		
		new Start();		
	}
}