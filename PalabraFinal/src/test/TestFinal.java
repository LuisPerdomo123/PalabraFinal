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
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); Esta sentencia no se puede reallizar, dado que la variable se ha declarado como final
        //No se puede asignar otra referencia de objeto a la clase Persona, dado que contiene la palabra final
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 nombre = " + persona1.getNombre());

        
    }
}
