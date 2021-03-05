/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.controller;

import edunova.jp23.model.Grupa;
import edunova.jp23.util.EdunovaException;
import java.util.List;

/**
 *
 * @author filip
 */
public class ObradaGrupa extends Obrada<Grupa>{

    @Override
    public List<Grupa> getPodaci() {
        return session.createQuery("from Grupa").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }
    
}
