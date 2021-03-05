/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23;

import edunova.jp23.controller.ObradaPolaznik;
import edunova.jp23.controller.ObradaSmjer;
import edunova.jp23.model.Polaznik;
import edunova.jp23.model.Smjer;
import edunova.jp23.util.EdunovaException;
import edunova.jp23.util.InitialFixtures;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author filip
 */
public class Start {
    
    public static void main(String[] args) {
        /*
        Smjer s = new Smjer();
        s.setNaziv("");
        s.setCijena(BigDecimal.TEN);
        ObradaSmjer os=new ObradaSmjer();
        os.setEntitet(s);
        
        try {
            os.create();
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }
        */
        
        Polaznik p = new Polaznik();
        p.setIme("Pero");
        p.setPrezime("Zaljubljeni");
        p.setEmail("pero.zaljubljeni@gmail.com");
        p.setOib("11909379742");
        ObradaPolaznik op=new ObradaPolaznik();
        op.setEntitet(p);
        
        try {
            op.create();
             } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
            
            
            // for(Smjer smjer : os.getPodaci()){
            //     System.out.println(smjer.getNaziv());
            // }
       
       
       

    }
    
}
       

