/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author lepo9
 */
public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;//La palabra final no permite modificar el valor de la variable
        System.out.println("miVariable = " + miVariable);
        
//        Persona.MI_CONSTANTE = 5;

        System.out.println("Mi contante: "  + Persona.MI_CONSTANTE);

        
    }
}
