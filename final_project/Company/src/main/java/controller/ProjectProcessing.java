/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Project;
import util.CompanyException;

/**
 *
 * @author filip
 */
public class ProjectProcessing extends Processing<Project>{

    @Override
    public List<Project> getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
