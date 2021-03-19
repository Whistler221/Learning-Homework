/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author filip
 */
public class CompanyException extends Exception {
    
    private String message;
    
    public CompanyException(String message){
        super();
        this.message=message;
    }
    
    public String getMessage(){
        return message;
    }
}
