package crud;

import java.util.ArrayList;
import java.util.List;


public class Start {
	

	

	public Start() {
		
		companies = new ArrayList();
		projects = new ArrayList();
		employeeInformations = new ArrayList();	
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
		
		System.out.println("-----------Company-----------");
		optionsCompanyMenu();
		switch (Auxiliary.inputNumber("Chose path", 1, 11)) {
		
		case 1:
			listCompany();
			break;
		
		case 2:
			inputNewCompanyName();
			break;
			
		case 3:
			listHQ_location();
			break;
			
		case 4:
			inputNewHQ_location();
			break;
			
		case 11:
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
        c.setName(Auxiliary.inputString("Input Company name"));
        Company.add(c);
        companyMenu();
	}

	private void listHQ_location() {
		for(HQ_location HQ_location : hq_locations) {
			System.out.printf("HQ_location %s", hq_location.getName());
			
		}
		
	}

	
	private void inputNewHQ_location() {
		
		
		
		
	}
	
	private void optionsCompanyMenu() {
		
		
	}



	private void projectMenu() {
		// TODO Auto-generated method stub
		
	}




	private void employeeInfoMenu() {
		// TODO Auto-generated method stub
		
	}




	private void auxiliaryMenu() {
		// TODO Auto-generated method stub
		
	}	
}