/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.math.BigDecimal;
import java.util.List;
import model.CompanyProject;
import util.CompanyException;

/**
 *
 * @author filip
 */
public class CPProcessing extends Processing<CompanyProject>{
    // Company Project Processing//
   
    @Override
    public List<CompanyProject> getData() {
        return session.createQuery("from Company").list();
    }

    @Override
    protected void controlCreate() throws CompanyException {
        controlSetProjectDescription();
        controlSetProjectCost();
    }

    @Override
    protected void controlUpdate() throws CompanyException {
        controlCreate();
    }

    @Override
    protected void controlDelete() throws CompanyException {
        
    }

    private void controlSetProjectDescription() throws CompanyException {
        if(entitet.getProjectDescription().length() < 1000) {
            throw new CompanyException("Max character is set to 1000");
        }
    }

    private void controlSetProjectCost() throws CompanyException {
        if (entitet.getProjectCost() == null
                || entitet.getProjectCost().compareTo(BigDecimal.ZERO) <= 0) {
            throw new CompanyException("The price must be set and greater than 0");
        }
    }
    
}
