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

    }

    private void controlID() throws CompanyException {
        if (!idCheck(entitet.getIdNumber())) {
            throw new CompanyException("ID not formally correct");
        }

    }

    private boolean idCheck(String idNumber) {

        if (idNumber == null || idNumber.length() != 11) {
            return false;
        }

        try {
            Long.parseLong(idNumber);
        } catch (NumberFormatException e) {
            return false;
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(idNumber.substring(i, i + 1));
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int control = 11 - a;
        if (control == 10) {
            control = 0;
        }
        return control == Integer.parseInt(idNumber.substring(10));

    }
}
