/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.math.BigDecimal;
import java.util.List;
import model.Project;
import util.CompanyException;

/**
 *
 * @author filip
 */
public class ProjectProcessing extends Processing<Project> {

    @Override
    public List<Project> getData() {
        return session.createQuery("from Project").list();
    }

    @Override
    protected void controlCreate() throws CompanyException {
        controlSetName();
        controlSetLocation();
        controlSetProjectCost();
    }

    @Override
    protected void controlUpdate() throws CompanyException {

    }

    @Override
    protected void controlDelete() throws CompanyException {

    }

    private void controlSetName() throws CompanyException {
        if (entitet.getName() == null || entitet.getName().isEmpty()) {
            throw new CompanyException("The name must be entered");
        }
    }

    private void controlSetLocation() throws CompanyException {
        if (entitet.getLocation() == null || entitet.getLocation().isEmpty()) {
            throw new CompanyException("HQ location must be entered");
        }
    }

    private void controlSetProjectCost() throws CompanyException {
        if (entitet.getProjectCost() == null
                || entitet.getProjectCost().compareTo(BigDecimal.ZERO) <= 0) {
            throw new CompanyException("The price must be set and greater than 0");
        }
    }

}
