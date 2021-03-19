/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Company;
import util.CompanyException;

/**
 *
 * @author filip
 */
public class CompanyProcessing extends Processing<Company> {

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
    protected void controlCreate() throws CompanyException {
        controlNameSet();
        controlNameLenght();
        controlSetHqLocation();
        controlLenghtHqLocation();
        controlSetOfficeLocation();
        controlLenghtOfficeLocation();
        controlSetCompanyCID();
        controlLenghtCompanyCID();
        controlSetEmail();
        controlLenghtEmail();
        controlSetContactInformation();
        controlLenghtContactInformation();
        controlSetIBan();
        controlLenghtIBan();
    }

    @Override
    protected void controlUpdate() {

    }

    @Override
    protected void controlDelete() {

    }

    private void controlNameSet() throws CompanyException {
        if (entitet.getName() == null || entitet.getName().isEmpty());
        throw new CompanyException("The name must be set");
    }

    private void controlNameLenght() throws CompanyException {
        if (entitet.getName().length() > 50) {
            throw new CompanyException("Name is too long max characters 50");
        }
    }

    private void controlSetHqLocation() throws CompanyException {
        if (entitet.getHqLocation() == null || entitet.getHqLocation().isEmpty());
        throw new CompanyException("HQ location must be entered");
    }

    private void controlLenghtHqLocation() throws CompanyException {
        if (entitet.getHqLocation().length() > 100) {
            throw new CompanyException("Location input too long max characters 100");
        }
    }

    private void controlSetOfficeLocation() throws CompanyException {
        if (entitet.getOfficeLocation() == null || entitet.getOfficeLocation().isEmpty());
        throw new CompanyException("Office location must be entered");
    }

    private void controlLenghtOfficeLocation() throws CompanyException {
        if (entitet.getOfficeLocation().length() > 100) {
            throw new CompanyException("Office location input too long max characters 100");
        }
    }

    private void controlSetCompanyCID() throws CompanyException {
        if (entitet.getCompanyCID() == null || entitet.getCompanyCID().isEmpty());
        throw new CompanyException("Company CID number must be entered");
    }

    private void controlLenghtCompanyCID() throws CompanyException {
        if ((entitet.getCompanyCID().length() != 12) || (entitet.getCompanyCID().length() != 11)) {
            throw new CompanyException("CID input is not valid, length can either be 11 or 12 characters long");
        }
    }

    private void controlSetEmail() throws CompanyException {
        if (entitet.getEmail() == null || entitet.getEmail().isEmpty());
        throw new CompanyException("Email must be entered");
    }

    private void controlLenghtEmail() throws CompanyException {
        if (entitet.getEmail().length() > 254) {
            throw new CompanyException("Email max characters is 254");
        }
    }

    private void controlSetContactInformation() throws CompanyException {
        if (entitet.getContactInformation() == null || entitet.getContactInformation().isEmpty());
            throw new CompanyException("Descriptiom must be entered");

    }
    
    private void controlLenghtContactInformation() throws CompanyException {
        if (entitet.getContactInformation().length() > 1000) {
            throw new CompanyException("Contact information max characters is set to 1000");
        }
    }
    
    private void controlSetIBan() throws CompanyException {
        if (entitet.getIban()==null || entitet.getIban().isEmpty());
        throw new CompanyException("Iban must be entered");
    }
    
    private void controlLenghtIBan() throws CompanyException {
        if (entitet.getIban().length() > 34) {
            throw new CompanyException("Iban max characters is 34");
        }
    }

}
