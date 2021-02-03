/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.boletin13;


public class Morcego extends Mamifero implements IPodeVoar{

    @Override
    public void podeVoar() {
        
        System.out.println("Pode voar");
        
    }
    public void amosar(){
        System.out.println("Esto es un murcielago");
    }
    
}
