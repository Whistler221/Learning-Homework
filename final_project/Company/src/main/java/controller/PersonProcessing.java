/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Person;
import util.CompanyException;

/**
 *
 * @author filip
 */
public abstract class PersonProcessing<T extends Person> extends Processing<T> {

    @Override
    public List<T> getData() {
         return session.createQuery("from Person").list();
    }

    @Override
    protected void controlCreate() throws CompanyException {
        controlNameSet();
        controlSetLastName();
        controlSetEmail();
        controlLenghtEmail();
        controlSetPhoneNumber();
        controlSetIban();
        controlLenghtIBan();
        //controlID();
    }

    @Override
    protected void controlUpdate() throws CompanyException {
        controlCreate();
        //controlID();

    }

    @Override
    protected void controlDelete() throws CompanyException {

    }

    private void controlID() throws CompanyException {
        if (!idCheck(entitet.getIdNumber())) {
            throw new CompanyException("ID not formally correct");
        }

    }

    private void controlNameSet() throws CompanyException {
        if (entitet.getName() == null || entitet.getName().isEmpty()) {
            throw new CompanyException("The name must be entered");
        }
    }

    private void controlSetLastName() throws CompanyException {
        if (entitet.getLastName() == null || entitet.getLastName().isEmpty()) {
            throw new CompanyException("The Lastname must be entered");
        }
    }

    private void controlSetEmail() throws CompanyException {
        if (entitet.getEmail() == null || entitet.getEmail().isEmpty()) {
            throw new CompanyException("Email must be entered");
        }
    }

    private void controlSetPhoneNumber() throws CompanyException {
        if (entitet.getPhoneNumber() == null || entitet.getPhoneNumber().isEmpty()) {
            throw new CompanyException("Phone number must be entered");
        }
    }

    private void controlSetIban() throws CompanyException {
        if (entitet.getIban() == null || entitet.getIban().isEmpty()) {
            throw new CompanyException("Iban must be entered");
        }
    }

    private void controlLenghtIBan() throws CompanyException {
        if (entitet.getIban().length() > 34) {
            throw new CompanyException("Iban max characters is 34");
        }
    }

    private void controlLenghtEmail() throws CompanyException {
        if (entitet.getEmail().length() > 254) {
            throw new CompanyException("Email max characters is 254");
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
    
    private boolean idCheck() {
        
        return true;
        
    }
    
}
