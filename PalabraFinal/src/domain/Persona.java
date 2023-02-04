/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author lepo9
 */
public class Persona {
    
    /*
    Cuando se combina la palabra final y static se conoce como constante.
    Final: No permite modificar el contenido.
    Static: Realizar el llamado de la variable sin crear objeto.
    Se recomuenda que la constante de defina en maysucular y guion bajo para separar palabras
    */
    
    public final static int MI_CONSTANTE = 1;
    
    private String nombre;
    
    
    
    /*
    Si se incluya la palabra final en la clase o en el metodo, las clases
    hijas no podran modificar su contenido.
    */
    
    public void imprimir(){
    
        System.out.println("Metodo imprimir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
