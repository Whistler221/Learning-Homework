/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.EmployeeProcessing;
import controller.PersonProcessing;
import java.util.Date;
import java.util.List;
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
public class Employee extends Person{

    

    @ManyToMany
    private List<Paycheck> paychecks;


    public List<Paycheck> getPaychecks() {
        return paychecks;
    }

    public void setPaychecks(List<Paycheck> paychecks) {
        this.paychecks = paychecks;
    }

    

}
