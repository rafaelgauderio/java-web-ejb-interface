/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.ejb.EjbLocalLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author rafael
 */
@Named(value = "jsfLocal")
@RequestScoped
public class JsfLocal {

    @EJB
    private EjbLocalLocal ejbLocal;  
   
    public JsfLocal() {
        
        
    }
    
    private int number;
    private double result;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    public void square() {
        result = ejbLocal.squareValue(number);
    }
    
}
