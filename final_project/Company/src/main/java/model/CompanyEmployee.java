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
import javax.persistence.ManyToMany;




/**
 *
 * @author filip
 */

@Entity
public class CompanyEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyemployeeId; 
    
    private Date startOfEmployment;
    private Date endOfEmployment;

    public int getCompanyemployeId() {
        return companyemployeeId;
    }

    public void setCompanyemployeId(int companyemployeId) {
        this.companyemployeeId = companyemployeId;
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