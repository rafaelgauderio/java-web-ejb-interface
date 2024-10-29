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
    private int base;
    private int exponent;
    private double resultExpo;
    private double resultRoot;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public double getResultExpo() {
        return resultExpo;
    }

    public void setResultExpo(double resultExpo) {
        this.resultExpo = resultExpo;
    }

    public double getResultRoot() {
        return resultRoot;
    }

    public void setResultRoot(double resultRoot) {
        this.resultRoot = resultRoot;
    }
    
    public void exponential() {
        resultExpo = ejbLocal.exponentialTo(base, exponent);
    }
    
    public void squareRoot () {
        resultRoot = ejbLocal.squareRoot(number);
    }
    
    
    
}
