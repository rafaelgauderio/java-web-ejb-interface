/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author rafael
 */
@Stateless
public class EjbLocal implements EjbLocalLocal {

    
    public double exponentialTo(int base, int exponent  ) {
        return Math.pow(base,exponent);
    }
    
}
