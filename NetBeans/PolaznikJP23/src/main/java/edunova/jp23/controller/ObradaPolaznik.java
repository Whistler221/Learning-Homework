/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.controller;

import edunova.jp23.model.Polaznik;
import edunova.jp23.util.EdunovaException;
import java.util.List;

/**
 *
 * @author filip
 */
public class ObradaPolaznik extends ObradaOsoba<Polaznik>{


    @Override
    public List<Polaznik> getPodaci() {
        return session.createQuery("from Polaznik p "
                + " order by p.prezime, p.ime").list();
    }
    
    public List<Polaznik> getPodaci(String uvjet) {
        return session.createQuery("from Polaznik p "
                + " where concat(p.ime, ' ', p.prezime, ' ', p.oib) "
                + " like :uvjet order by p.prezime, p.ime")
                .setParameter("uvjet", "%" + uvjet + "%")
                
                .setMaxResults(20)
                .list();
    }
    
     @Override
    protected void kontrolaCreate() throws EdunovaException {
       super.kontrolaCreate();
       //onda moje kontrole
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        super.kontrolaUpdate();
        //onda moje kontrole
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
       
    }
    
}
