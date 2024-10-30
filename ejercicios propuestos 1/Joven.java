/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joven;

/**
 *
 * @author Antonio Atienza
 */
public class Joven {

    static class Persona {
    public String nombre;}

    public static void main(String[] args) {
     Persona juanito = new Persona();   // creamos una instancia de una clase
     juanito.nombre = "juan";           // damos un valor a un campo de es instancia 
       System.out.println(juanito.nombre); // imprimir 
       cambiarNombre(juanito, "juanito"); // paso esa referencia a otra función
       System.out.println(juanito.nombre);

       cambiarNombre(juanito); // paso esa referencia a otra función
       System.out.println(juanito.nombre);

    }
    static void cambiarNombre(Persona persona ){
        persona.nombre = "John"; }
        
         static void cambiarNombre(Persona persona , String nuevoNombre){
        persona.nombre = nuevoNombre; }
}

