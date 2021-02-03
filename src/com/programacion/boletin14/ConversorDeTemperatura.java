/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.boletin14;

import javax.swing.JOptionPane;

public class ConversorDeTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TemperaturaErradaExcepcion {
        
        try{
        ConversorTemperatura obx = new ConversorTemperatura();
        
        
        
        JOptionPane.showMessageDialog(null,"Fharenheit: "+obx.centigradosAFharenheit(Float.parseFloat(JOptionPane.showInputDialog("teclea los grados  a convertir en Fharenheit"))));
        obx.centigradosAReamur(Float.parseFloat(JOptionPane.showInputDialog("teclea los grados a convertir en Reamur")));
        }catch(TemperaturaErradaExcepcion e){
            
            System.out.println(e.getMessage());
            
        }
    }
    
}
