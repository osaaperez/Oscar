/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.boletin14;


public class TemperaturaErradaExcepcion extends Exception {
    
    private String mensajeError;
    
    public TemperaturaErradaExcepcion(String mensajeError){
        super();
        this.mensajeError=mensajeError;
    }
    @Override
    public String getMessage(){
        
        return mensajeError;
         
    }
    
    
    
    
    
}
