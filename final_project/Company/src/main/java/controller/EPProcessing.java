/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.EmployeeProject;
import util.CompanyException;

/**
 *
 * @author filip
 */
public class EPProcessing extends Processing<EmployeeProject>{
    // Employee Project Processing//
    @Override
    public List<EmployeeProject> getData() {
        return session.createQuery("from EmployeeProject").list();
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
