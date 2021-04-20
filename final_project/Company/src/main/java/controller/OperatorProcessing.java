/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Operator;
import org.mindrot.jbcrypt.BCrypt;
import util.CompanyException;

/**
 *
 * @author filip
 */
public class OperatorProcessing extends PersonProcessing<Operator>{

    /**
     * Authorization of base operator
     * @param email the email of the operator we want to authorize
     * @param password plain password as char [] entered by the user on the form
     * @return An instance of the Operator class if the operator with the given email exists and the password
     * matches. Returns null if the operator does not exist in the database or the password does not match
     */
    public Operator authorize (String email, char[] password) {
        
        Operator oper = (Operator)session
                .createQuery("from Operator o where o.email=:email")
                .setParameter("email", email)
                .getSingleResult();
        if(oper==null){
            return null;
        }
        return BCrypt.checkpw(new String(password),oper.getPassword()) ? oper : null;
    }
    
    
    @Override
    public List<Operator> getData() {
        return session.createQuery("from Operator").list();
    }

    @Override
    protected void controlDelete() throws CompanyException {
        
    }

    
    

}
