/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author filip
 */
@MappedSuperclass
public abstract class Entitet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Operator operatorInput;

    @ManyToOne
    private Operator operatorChanging;

    private Date inputDate;
    private Date changingDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Operator getOperatorInput() {
        return operatorInput;
    }

    public void setOperatorInput(Operator operatorInput) {
        this.operatorInput = operatorInput;
    }

    public Operator getOperatorChanging() {
        return operatorChanging;
    }

    public void setOperatorChanging(Operator operatorChanging) {
        this.operatorChanging = operatorChanging;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public Date getChangingDate() {
        return changingDate;
    }

    public void setChangingDate(Date changingDate) {
        this.changingDate = changingDate;
    }

}
