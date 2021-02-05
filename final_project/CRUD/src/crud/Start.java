package crud;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public Start() {
		
		companies = new ArrayList<>();
		projects = new ArrayList<>();
		employeeInformations = new ArrayList<>();	
		Menu();
	}

	private List<Company> companies;
	private List<Project> projects;
	private List<employeeInformation> employeeInformations; 

	private void Menu() {

		System.out.println("------------Company------------");
		auxiliaryMenu();
		switch (Auxiliary.inputNumber("Select an action", 1, 4)) {
		
		case 1:		
		companyMenu();
		break;
		
		case 2:
		projectMenu();
		break;
		
		case 3:
		employeeInfoMenu();
		
		case 4:
		System.out.println("Exit");
		break;
				
		}		
	}
	
	private void companyMenu() {
		
		System.out.println("-----------Company Menu-----------");
		optionsCompanyMenu();
		switch (Auxiliary.inputNumber("Chose path", 1, 5)) {
		
		case 1:
			listCompany();
			break;
		
		case 2:
			inputNewCompanyName();
			break;
						
		case 5:
			Menu();
				
		}	
	}

	private void listCompany() {
		for(Company company : companies) {
			System.out.printf("Name: %s", company.getName());
			System.out.println("");
		}
		companyMenu();
    }
		
	private void inputNewCompanyName() {
		
		Company c = new Company();
        c.setName(Auxiliary.inputString("Input Company name: "));
        c.setHQ_location(Auxiliary.inputString("Input HQ Location: "));
        c.setOfficeLocation(Auxiliary.inputString("Input Office location: "));
        c.setGovernmentRegisteredID(Auxiliary.inputNumber("Input G.R.ID: "));
        c.setFounderContactInfo(Auxiliary.inputString("Input Founders contact info: "));
        companies.add(c);
        companyMenu();
	}
		
	private void optionsCompanyMenu() {
				System.out.println("1. List all of the Companies");
				System.out.println("2. Input new Company");
				System.out.println("Work in progres");
				System.out.println("Work in progres");
				System.out.println("Exit to main menu");
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
			
		case 5:
			Menu();
			
		}
		
		
	}		

	private void listProjects() {
		
		for (Project project : projects) {
			System.out.printf("Name %s", project.getName());
			System.out.println("");
		}
		projectMenu();
	}
	
	private void inputNewProject() {
		Project p = new Project();
		p.setName(Auxiliary.inputString("Input Project name: "));
		p.setLocation(Auxiliary.inputString("Input Project location"));
		p.setCost(Auxiliary.inputNumber("Input Project cost"));
		projects.add(p);
		projectMenu();
		
	}

	private void optionsProjectMenu() {		
				System.out.println("1. List all of the Projects");
				System.out.println("2. Input new Project");
				System.out.println("Work in progres");
				System.out.println("Work in progres");
				System.out.println("Exit to main menu");
		
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
			
		case 5:
			Menu();
		}
		
	}
	
	private void listEmployeeInfo() {
		
		for (employeeInformation employeeInformation : employeeInformations ) {
			System.out.printf("Name: %s  Lastname: %s", 
					employeeInformation.getName() ,
					employeeInformation.getLastname());
			System.out.println("");
		}
		employeeInfoMenu();
	}
	
	private void inputNewEmployeeInfo() {
		
		employeeInformation e = new employeeInformation();
		e.setName(Auxiliary.inputString("Input Employee name: "));
		e.setLastname(Auxiliary.inputString("Input Employee lastname: "));
		e.setContactInfo(Auxiliary.inputString("Input Employee contact info: "));
		e.setIban(Auxiliary.inputString("Input Employee Iban"));
		e.setSalary(Auxiliary.inputNumber("Input Employee salary"));
		employeeInformations.add(e);
		employeeInfoMenu();
	}

	private void employeeInfoOptions() {
				System.out.println("1. List all of the Employee info");
				System.out.println("2. Input new Employee info");
				System.out.println("Work in progres");
				System.out.println("Work in progres");
				System.out.println("Exit to main menu");
		
	}

	private void auxiliaryMenu() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
	}
}