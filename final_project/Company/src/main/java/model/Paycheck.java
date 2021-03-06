/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author filip
 */

@Entity
public class Paycheck{
    
    
    @Id
    private int paycheckId;
    
    private BigDecimal  salary;
    private String      currency;
    private BigDecimal  hourlywage;

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getHourlywage() {
        return hourlywage;
    }

    public void setHourlywage(BigDecimal hourlywage) {
        this.hourlywage = hourlywage;
    }

    public int getPaycheckId() {
        return paycheckId;
    }

    public void setPaycheckId(int paycheckId) {
        this.paycheckId = paycheckId;
    }
    
    
}
