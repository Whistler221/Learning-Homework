/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import controller.CompanyProcessing;
import model.Company;
import util.CompanyException;
//import util.InitialFixtures;
//import org.hibernate.Session;
//import util.Hibernate;

/**
 *
 * @author filip
 */
public class Start {
    
    public static void main(String[] args) {
        
        
        //InitialFixtures.start();
        
        Company c = new Company();
        c.setName("");
        c.setHqLocation("New HQ Location");
        c.setOfficeLocation("New Ofice Location");
        c.setCompanyCID("C2019010968");
        c.setEmail("newemail@gmail.com");
        c.setContactInformation("Contact info");
        //date
        c.setIban("HR3424020061255883345");
        CompanyProcessing cp= new CompanyProcessing();
        cp.setEntitet(c);
        
        try {
            cp.create();
        } catch (CompanyException e) {
            System.out.println(e.getMessage());
        }
        

        
        //Session s = Hibernate.getSession();
        
        //System.out.println(s.getMetamodel().getEntities().size());
        
        //s.beginTransaction();
        
        //s.getTransaction().commit();
    }
       
}
