/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Employee;
import util.CompanyException;

/**
 *
 * @author filip
 */
public abstract class EmployeeProcessing<T extends Employee> extends Processing<T> {

    @Override
    protected void controlCreate() throws CompanyException {
        controlID();
    }

    @Override
    protected void controlUpdate() throws CompanyException {
        controlID();
    }

    @Override
    protected void controlDelete() throws CompanyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void controlID() throws CompanyException {
        if (!idCheck(entitet.getIdNumber())) {
            throw new CompanyException("ID not formally correct");
        }

    }

    private boolean idCheck(String idNumber) {

        return false;
    }
}
