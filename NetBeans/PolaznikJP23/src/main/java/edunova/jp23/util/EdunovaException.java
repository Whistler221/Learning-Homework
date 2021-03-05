/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.util;

/**
 *
 * @author filip
 */
public class EdunovaException extends Exception{
    
    private String poruka;
    
    public EdunovaException(String poruka){
        super();
        if(poruka !=null && poruka.length()>2 &&
                poruka.endsWith(", ")) {
            this.poruka=poruka.substring(0,poruka.length()-2);
        }else{
            this.poruka=poruka;
        }
        
    }

    public String getPoruka() {
        return poruka;
    }
    
    
    
}

