/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.util;

import com.github.javafaker.Faker;
import edunova.jp23.controller.ObradaPolaznik;
import edunova.jp23.model.Polaznik;


/**
 *
 * @author filip
 */
public class Test {
    
    public static void main(String[] args) {
        
        Faker faker = new Faker();
        ObradaPolaznik s = new ObradaPolaznik();
        Polaznik p;
        for(int i=0;i<100;i++){
            p=new Polaznik();
            p.setIme(faker.name().firstName());
            p.setPrezime(faker.name().lastName());
            p.setOib(EdunovaUtil.getOIB());
            p.setEmail(faker.internet().emailAddress());
            System.out.println(i + ": " + p.getOib());
            
            s.setEntitet(p);
            try {
                s.create();
            } catch (EdunovaException e) {
                System.out.println(e.getPoruka());
            }

        }
        
    }    
}
