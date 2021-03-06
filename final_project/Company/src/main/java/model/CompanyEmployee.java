/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


/**
 *
 * @author filip
 */


public class CompanyEmployee {
    
    private Date startOfEmployment;
    private Date endOfEmployment;

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
