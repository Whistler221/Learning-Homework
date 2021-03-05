/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.controller;

import edunova.jp23.model.Smjer;
import edunova.jp23.util.EdunovaException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author filip
 */
public class ObradaSmjer extends Obrada<Smjer> {
    
    public ObradaSmjer(){
        super();
    }
    public ObradaSmjer(Smjer s){
        super(s);
    }
    
    @Override
    public List<Smjer> getPodaci() {
        //https://docs.jboss.org/hibernate/orm/3.3/reference/en/html/queryhql.html
       return session.createQuery("from Smjer").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
       //kontrolaNaziv();
       kontrolaCijena();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException{
       kontrolaCreate();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
       
    }
    
    private void kontrolaNaziv() throws EdunovaException{
       kontrolaNazivPostavljen();
       kontrolaNazivDuzina();
    }
    
    private void kontrolaNazivPostavljen() throws EdunovaException{
        if(entitet.getNaziv()==null 
               || entitet.getNaziv().isEmpty()){
           throw new EdunovaException("Naziv mora biti postavljen");
       }
    }

    private void kontrolaNazivDuzina()throws EdunovaException {
        if(entitet.getNaziv().length()>50){
            throw new EdunovaException("Naziv predugačak");
        }
    }
    
    private void kontrolaCijena() throws EdunovaException{
        if(entitet.getCijena()==null 
               || entitet.getCijena().compareTo(BigDecimal.ZERO)<=0){
           throw new EdunovaException("Cijen mora biti postavljena i veća od 0");
       }
    }
    
}