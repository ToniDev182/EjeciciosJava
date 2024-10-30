/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.piramide;

/**
 *
 * @author Antonio Atienza
 */
import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa el número de filas para la pirámide: ");
        int totalpisos = dato.nextInt(); // Pide el numero para que el usario lo inserte por pantalla
        
        for (int pisoactual = 1; pisoactual <= totalpisos; pisoactual++) {
            // Imprimir espacios en blanco a la izquierda
            for (int espacio = 1; espacio <= totalpisos - pisoactual; espacio++) {
                System.out.print(" ");
            }
            
            // Imprimir asteriscos
            for (int astreriscos = 1; astreriscos <= 2 * pisoactual  - 1; astreriscos++ ) {
                System.out.print("*");
            }
            
            // Cambiar de línea para la siguiente fila y vuelve arriba
            System.out.println();
        }
        
        dato.close();
    }
}

