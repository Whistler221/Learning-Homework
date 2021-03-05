package dz.edunova.jp23;

import Util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author filip
 */
public class Start {
    
    public static void main(String[] args) {
        
        Session s = HibernateUtil.getSession();
        
        
        System.out.println(s.getMetamodel().getEntities().size());
        
        s.beginTransaction();
        
        s.getTransaction().commit();
    }
    
}