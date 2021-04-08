/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import model.Entitet;
import org.hibernate.Session;
import util.CompanyException;
import util.Hibernate;
import view.Application;

/**
 *
 * @author filip
 */
public abstract class Processing<T extends Entitet> {

    protected T entitet;
    protected Session session;
    protected Validator validator;

    public abstract List<T> getData();

    protected abstract void controlCreate() throws CompanyException;

    protected abstract void controlUpdate() throws CompanyException;

    protected abstract void controlDelete() throws CompanyException;

    public Processing() {
        this.session = Hibernate.getSession();
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        this.validator = factory.getValidator();
    }

    public T getEntitet() {
        return entitet;
    }

    public Processing(T entitet) {
        this();
        this.entitet = entitet;
    }

    public T create() throws CompanyException {
        control();
        controlCreate();
        entitet.setOperatorInput(Application.operator);
        entitet.setInputDate(new Date());
        save();
        return this.entitet;
    }

    public T update() throws CompanyException {
        control();
        controlUpdate();
        entitet.setOperatorInput(Application.operator);
        entitet.setInputDate(new Date());
        save();
        return this.entitet;
    }

    public boolean Delete() throws CompanyException {
        controlDelete();
        session.beginTransaction();
        session.delete(this.entitet);
        session.getTransaction().commit();
        return true;
    }

    private void save() {
        session.beginTransaction();
        session.save(this.entitet);
        session.getTransaction().commit();
    }

    private void control() throws CompanyException {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(this.entitet);

        if (constraintViolations.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (ConstraintViolation<T> violation : constraintViolations) {
                sb.append(violation.getMessage());
                sb.append(", ");
            }
            throw new CompanyException(sb.toString());

        }
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

}
