package crud;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

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
		for(Company company : companies) {
			System.out.printf("Name: %s", company.getName());
			System.out.println("");
		}
		companyMenu();
    }
		
	private void inputNewCompany() {
		
		Company c = new Company();
        c.setName(Auxiliary.inputString("Input Company name: "));
        c.setHQ_location(Auxiliary.inputString("Input HQ Location: "));
        c.setOfficeLocation(Auxiliary.inputString("Input Office location: "));
        c.setGovernmentRegisteredID(Auxiliary.inputNumber("Input G.R.ID: "));
        c.setFounderContactInfo(Auxiliary.inputString("Input Founders contact info: "));
        companies.add(c);
        save();
        companyMenu();
	}
	
	private void changeCompany() {
		allCompanies();
		int choice = Auxiliary.inputNumber("Chose option", 1, companies.size())-1;		
		var c=companies.get(choice);
		
		c.setName(Auxiliary.inputString("Name (" + c.getName() + ")"));
		c.setHQ_location(Auxiliary.inputString("HQ location (" + c.getHQ_location() + ")"));
		c.setOfficeLocation(Auxiliary.inputString("Offic location (" + c.getOfficeLocation() + ")"));
		c.setGovernmentRegisteredID(Auxiliary.inputNumber("G.R.ID (" + c.getGovernmentRegisteredID() + ")"));
		c.setFounderContactInfo(Auxiliary.inputString("Founders info (" + c.getFounderContactInfo() + ")"));
		companies.set(choice, c);
		save();
		optionsCompanyMenu();
			
	}
		
	private void allCompanies() {
		System.out.println("---------------------");
		for (int i=0; i<companies.size(); i++) {
			var c = companies.get(i);
			System.out.println((i+1) + " . " + c.getName());
		}
		System.out.println("---------------------");
	}

	private void optionsCompanyMenu() {
				System.out.println("1. List all of the Companies");
				System.out.println("2. Input new Company");
				System.out.println("Change Company");
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
		save();
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
		save();
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
	
	private void save() {		
		Gson gson = new Gson();	
		//System.out.println(gson.toJson(companies));
		//System.out.println(gson.toJson(projects));
		//System.out.println(gson.toJson(employeeInformations));
		
		
		try {
			FileWriter fw = new FileWriter(new File("data.json"));
			fw.write(gson.toJson(companies));
			fw.close();
			
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		new Start();
		
	}
}