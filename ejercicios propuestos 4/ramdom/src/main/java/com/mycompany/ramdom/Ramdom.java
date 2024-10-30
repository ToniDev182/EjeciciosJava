/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ramdom;

/**
 *
 * @author: Antonio Atienza 
 */
import java.util.Random;

public class Ramdom {
    public static void main(String[] args) {
        // Creamos un objeto Random para generar números aleatorios
        Random random = new Random();
        
        System.out.println("Números múltiplos de 3:");

        // Generamos 100 números aleatorios
        for (int i = 0; i <= 100; i++) {
            // Genera   int numeroAleatorio = random.nextInt(1000); mos un número aleatorio en un rango de 0 a 999
            int numeroAleatorio = random.nextInt(1000); 
            
            // Comprobamos si el número es múltiplo de 3 usando el operador módulo (%)
            if (numeroAleatorio % 3 == 0) {
                // Si es múltiplo de 3, lo mostramos en la consola
                System.out.println(numeroAleatorio);
            }
        }
    }
}