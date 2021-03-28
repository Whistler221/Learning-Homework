/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controller.OperatorProcessing;
import model.Operator;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author filip
 */
public class CreateOperator {

    public static void main(String[] args) {
        Operator o = new Operator();
        o.setName("Filip");
        o.setLastName("Klobucar");
        o.setEmail("filip.klobucar1@hotmail.com");
        o.setPassword(BCrypt.hashpw("Company", BCrypt.gensalt()));
        o.setPhoneNumber("+385-925-5548-64");
        o.setIdNumber("99109676479");
        o.setIban("NL92ABNA6022027691");

        OperatorProcessing op = new OperatorProcessing();

        op.setEntitet(o);

        try {
            op.create();
        } catch (CompanyException e) {
            System.out.println(e.getMessage());
        }
    }
}
