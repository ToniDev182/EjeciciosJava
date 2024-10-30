/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisores;

// @autor: Antonio Atienza
public class Divisores {
    public static void main(String[] args) {
        // Comprobar si se proporciona un solo argumento en la línea de comandos
        if (args.length != 1) {
            
        }

            // Convertir el argumento a un número entero
            int numero = Integer.parseInt(args[0]);

            // Mostrar un encabezado indicando de qué número se están mostrando los divisores
            System.out.println("Divisores de " + numero + ":");

            // Iterar desde 1 hasta el número y comprobar si i es un divisor del número
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    // Si i es un divisor, mostrarlo en la consola
                    System.out.println(i);
                    
                    //Para ejecutar el programa con un número dado como parámetro, ve a "Run" en el menú superior y selecciona "
                    //Set Project Configuration" > "Customize..." y en la pestaña "Run", ingresa el número deseado como argumento en el campo "Arguments" y haz clic en "OK."
                    //Finalmente, ejecuta el programa seleccionando "Run" en el menú superior y luego "Run Project."
                }
            }
        } 
           
        }
   

