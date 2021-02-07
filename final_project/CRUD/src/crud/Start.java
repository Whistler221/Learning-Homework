package crud;

import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;

public class Start {

	private List<Company> companies;
	private static final String PATH_COMPANIES="companies.Json";
	private List<Project> projects;
	private List<employeeInformation> employeeInformations; 
	
	public Start() {
		
		companies = new ArrayList<>();
		loadCompanies();
		projects = new ArrayList<>();
		employeeInformations = new ArrayList<>();	
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
	
	private void save() {		
		Gson gson = new Gson();			
		try {
			FileWriter fw = new FileWriter(new File(PATH_COMPANIES));
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
	
	private void loadCompanies() {
		
		if (!new File(PATH_COMPANIES).exists()) {
			return;
		}
		try {
			Type listType = new TypeToken<List<Company>>(){}.getType();
			String json=Files.readString(Path.of(PATH_COMPANIES));
			companies = new Gson().fromJson(json, listType);
		}catch(Exception e) {
			e.printStackTrace(); 
		}
	}


	private void listCompany() {
		allCompanies();
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
	
	//private void loadProjects() {
	//	
	//	if (!new File(PATH_PROJECTS).exists()) {
	//		return;
	//	}

	private void inputNewProject() {
		Project p = new Project();
		p.setName(Auxiliary.inputString("Input Project name: "));
		p.setLocation(Auxiliary.inputString("Input Project location"));
		p.setCost(Auxiliary.inputNumber("Input Project cost"));
		projects.add(p);
		save();
		projectMenu();
		
	}
	
	private void changeProject() {
		allProjects();
		int choice = Auxiliary.inputNumber("Chose option", 1, projects.size())-1;
		var p=projects.get(choice);
		
		p.setName(Auxiliary.inputString("Name (" + p.getName() + ")"));
		p.setLocation(Auxiliary.inputString("Location (" + p.getLocation() + ")"));
		p.setCost(Auxiliary.inputNumber("Cost (" + p.getCost() + ")"));
		projects.set(choice, p);
		save();
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
	
	private void changeEmployeeInfo() {
		allEmployees();
		int choice = Auxiliary.inputNumber("Chose option", 1, employeeInformations.size())-1;
		var e=employeeInformations.get(choice);
		
		e.setName(Auxiliary.inputString("Name (" + e.getName() + ")"));
		e.setLastname(Auxiliary.inputString("Last name (" + e.getLastname() + ")"));
		e.setContactInfo(Auxiliary.inputString("Contact info (" + e.getContactInfo() + ")"));
		e.setIban(Auxiliary.inputString("Iban (" + e.getIban() + ")"));
		e.setSalary(Auxiliary.inputNumber("Salary (" + e.getSalary() + ")"));
		employeeInformations.set(choice, e);
		save();
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
				System.out.println("2. Input new Employee info");
				System.out.println("3. Chane Employee info");
				System.out.println("4. Work in progres");
				System.out.println("5. Exit to main menu");
		
	}	
	
	public static void main(String[] args) {
		
		new Start();		
	}
}