/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.List;
import org.hibernate.Session;
import util.Hibernate;


/**
 *
 * @author filip
 */
public abstract class Processing<T> {
    
    protected T entitet;
    protected  Session session;
    
    public abstract List<T>getData();
    protected abstract void controlCreate();
    protected abstract void controlUpdate();
    protected abstract void controlDelete();
    
    public Processing() {
        this.session=Hibernate.getSession();
    }

    public T getEntitet() {
        return entitet;
    }
    
    public Processing(T entitet) {
        this();
        this.entitet=entitet;
    }
    
    public T create(){
        controlCreate();
        save();
        return this.entitet;
    }
    
    public T update(){
        controlUpdate();
        save();
        return this.entitet;
    }
    
    public boolean Delete(){
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

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
    
    
}
