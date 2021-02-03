/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.boletin14;

import javax.swing.JOptionPane;


public class ConversorTemperatura {
    
    public final float cons =  80;
    
    
    public float centigradosAFharenheit(float temperatura)throws TemperaturaErradaExcepcion {
        
        
        if(temperatura>=cons){
            
            return (float) ( 9.0 / 5.0 * temperatura + 32.4);
        }else{
            throw new TemperaturaErradaExcepcion("Los grados no pueden ser menores a 80ºC");
        }
        
            
        
    }
    public void centigradosAReamur(float temperatura)throws TemperaturaErradaExcepcion {
        
        float reamur;
        if(temperatura>=cons){
            
            reamur=4.0f/5.0f*temperatura;
            System.out.println("Reamur: "+reamur);
   
        }else{
            throw new TemperaturaErradaExcepcion("Los grados no pueden ser menores a 80ºC");
        }
        
            
        
    }


    
}



