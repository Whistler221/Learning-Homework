package crud;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;

public class JsonHandler {
	
	private static final String PATH_COMPANIES="companies.Json";
	private static final String PATH_PROJECTS="projects.Json";
	private static final String PATH_EMPLOYEEINFORMATIONS="employeeInformations.Json";

	
	public static void saveCompanies(List<Company> companies) {		
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
	
	public static void saveProjects(List<Project> projects) {		
		Gson gson = new Gson();			
		try {
			FileWriter fw = new FileWriter(new File(PATH_PROJECTS));
			fw.write(gson.toJson(projects));
			fw.close();
			
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void saveEmployeeInfo(List<employeeInformation> employeeInformations) {		
		Gson gson = new Gson();			
		try {
			FileWriter fw = new FileWriter(new File(PATH_EMPLOYEEINFORMATIONS));
			fw.write(gson.toJson(employeeInformations));
			fw.close();
			
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void loadCompanies(List<Company> companies) {
		
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
	
	public static void loadProjects(List<Project> projects) {
		
		if (!new File(PATH_PROJECTS).exists()) {
			return;
		}
		try {
			Type listType = new TypeToken<List<Company>>(){}.getType();
			String json=Files.readString(Path.of(PATH_PROJECTS));
			projects = new Gson().fromJson(json, listType);
		}catch(Exception e) {
			e.printStackTrace(); 
		}
	}
	
	public static void loadEmployeeInfo(List<employeeInformation> employeeInformations) {
		
		if (!new File(PATH_EMPLOYEEINFORMATIONS).exists()) {
			return;
		}
		try {
			Type listType = new TypeToken<List<Company>>(){}.getType();
			String json=Files.readString(Path.of(PATH_EMPLOYEEINFORMATIONS));
			employeeInformations = new Gson().fromJson(json, listType);
		}catch(Exception e) {
			e.printStackTrace(); 
		}
	}
	
}
