/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author filip
 */
@Entity
@Table(name = "company")
public class Company {

    @Id
    private Long companyID;
    
    @ManyToMany
    private List<CompanyEmployee> companyemployees=new ArrayList<>();

    public List<CompanyEmployee> getCompanyemployees() {
        return companyemployees;
    }

    public void setCompanyemployees(List<CompanyEmployee> companyemployees) {
        this.companyemployees = companyemployees;
    }
    
    
    
    
    private String  name;
    private String  hqLocation;
    private String  officeLocation;
    private Integer employerIdentificationNumber;
    private String  email;
    private String  contactInformation;
    private Date    establishmentDate;
    private String  iban;

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHqLocation() {
        return hqLocation;
    }

    public void setHqLocation(String hqLocation) {
        this.hqLocation = hqLocation;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public Integer getEmployerIdentificationNumber() {
        return employerIdentificationNumber;
    }

    public void setEmployerIdentificationNumber(Integer employerIdentificationNumber) {
        this.employerIdentificationNumber = employerIdentificationNumber;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public Date getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(Date establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Long companyID) {
        this.companyID = companyID;
    }
    
    
}
