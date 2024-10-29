/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ejb;

import javax.ejb.Local;

/**
 *
 * @author rafael
 */
@Local
public interface EjbLocalLocal {
    
    // to be access the methos has to be declareted on local interface
      public double exponentialTo(int base, int exponent);
    
}
