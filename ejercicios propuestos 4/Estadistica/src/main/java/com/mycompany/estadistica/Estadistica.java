/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadistica;

/**
 *
 * @Antonio Atienza
 */
import java.util.Scanner;

public class Estadistica {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de usuario.
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario la cantidad de números a procesar.
        System.out.print("Ingrese la cantidad de números a procesar: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("La cantidad de números debe ser mayor que cero.");
            return; // Salir del programa si la cantidad es inválida.
        }
        
        // Inicializar variables para la suma, el máximo y el mínimo.
        int suma = 0;
        int maximo = Integer.MIN_VALUE; // Inicializado con el valor mínimo posible.
        int minimo = Integer.MAX_VALUE; // Inicializado con el valor máximo posible.
        
        // Solicitar y procesar los números ingresados por el usuario.
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            
            // Calcular la suma de los números.
            suma += numero;
            
            // Actualizar el máximo si se ingresa un número mayor.
            if (numero > maximo) {
                maximo = numero;
            }
            
            // Actualizar el mínimo si se ingresa un número menor.
            if (numero < minimo) {
                minimo = numero;
            }
        }
        
        // Calcular la media aritmética.
        double media = (double) suma / n;
        
        // Mostrar los resultados.
        System.out.println("Media aritmética: " + media);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
    }
}
