/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.CompanyEmployee;
import model.Employee;
import util.CompanyException;

/**
 *
 * @author filip
 */
public class CEProcessing extends Processing<Employee>{
    // Company Employee Processing \\
    @Override
    public List<Employee> getData() {
        return session.createQuery("from Employee").list();
    }

    @Override
    protected void controlCreate() throws CompanyException {
        
    }

    @Override
    protected void controlUpdate() throws CompanyException {
        
    }

    @Override
    protected void controlDelete() throws CompanyException {
        
    }
    
    
    
    
}
