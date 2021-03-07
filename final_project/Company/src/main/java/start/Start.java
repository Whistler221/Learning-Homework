/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import org.hibernate.Session;
import util.Hibernate;

/**
 *
 * @author filip
 */
public class Start {
    
    public static void main(String[] args) {
        
        Session s = Hibernate.getSession();
        
        
        System.out.println(s.getMetamodel().getEntities().size());
        
        s.beginTransaction();
        
        s.getTransaction().commit();
    }
       
}
