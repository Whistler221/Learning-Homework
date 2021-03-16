/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Company;



/**
 *
 * @author filip
 */
public class CompanyProcessing extends Processing<Company>{

    public CompanyProcessing() {
        super();
    }
    
    public CompanyProcessing(Company c) {
        super(c);
    }
    
    @Override
    public List<Company> getData() {
        return session.createQuery("from Company").list();
       
    }

    @Override
    protected void controlCreate() {
        
    }

    @Override
    protected void controlUpdate() {
        
    }

    @Override
    protected void controlDelete() {
        
    }
    
    

    
}
