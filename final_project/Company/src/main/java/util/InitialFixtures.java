/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.math.BigDecimal;
import model.Company;
import org.hibernate.Session;
import java.util.Date;
import model.Employee;
import model.Project;

/**
 *
 * @author filip
 */
public class InitialFixtures {
    
    public static void start() {
        Session s = Hibernate.getSession();
        s.beginTransaction();
        
        Company company = new Company();
        company.setName("Đuro Đaković");
        company.setHqLocation("Slavonski Brod");
        company.setOfficeLocation("Dr. Mile Budaka 1");
        company.setEmployerIdentificationNumber(2145486221);
        company.setEmail("uprava@duro-dakovic.com");
        company.setContactInformation("+ 385 35 446 256");
        
        s.save(company);
        
        Employee employee = new Employee();
        employee.setName("Juraj");
        employee.setLastname("Bednaic");
        employee.setEmail("");
        employee.setPhoneNumber("+385-995-5564-86");
        employee.setIdNumber("154678594");
        employee.setIban("HR1002269399051943545");
        
        s.save(employee);
        
        Project project = new Project();
        project.setName("Patria AMV");
        project.setLocation("Slavonski Brod");
        project.setProjectCost(new BigDecimal(500000000));
        //project.setStartDate("199104-04");
        
        s.save(project);
        s.getTransaction().commit();
        
    }
}
