/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




/**
 *
 * @author filip
 */

@Entity
public class CompanyEmployee extends Entitet{

    
    @ManyToOne
    private Company company;
    @ManyToOne
    private Employee employee;
    
    private Date startOfEmployment;
    private Date endOfEmployment;


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getStartOfEmployment() {
        return startOfEmployment;
    }

    public void setStartOfEmployment(Date startOfEmployment) {
        this.startOfEmployment = startOfEmployment;
    }

    public Date getEndOfEmployment() {
        return endOfEmployment;
    }

    public void setEndOfEmployment(Date endOfEmployment) {
        this.endOfEmployment = endOfEmployment;
    }

}