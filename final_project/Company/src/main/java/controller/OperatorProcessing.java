/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Operator;

/**
 *
 * @author filip
 */
public class OperatorProcessing extends PersonProcessing<Operator>{

    @Override
    public List<Operator> getData() {
        return session.createQuery("from Operator").list();
    }

    

}
