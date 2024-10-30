/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bisiesto;

/**
 *
 * @author usuario
 */
import java.util.Scanner;  // Importa la clase Scanner para obtener entrada del usuario

public class Bisiesto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer la entrada del usuario

        System.out.print("Ingrese un año: ");  // Solicita al usuario ingresar un año
        int year = scanner.nextInt();  // Lee la entrada del usuario y la almacena en la variable "year"

        if (esBisiesto(year)) {  // Llama a la función "esBisiesto" para determinar si el año es bisiesto
            System.out.println(year + " es un año bisiesto.");  // Muestra un mensaje si el año es bisiesto
        } else {
            System.out.println(year + " no es un año bisiesto.");  // Muestra un mensaje si el año no es bisiesto
        }
    }

    // Función para determinar si un año es bisiesto
    public static boolean esBisiesto(int year) {
        // Un año es bisiesto si es divisible por 4, excepto si es divisible por 100 pero no por 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}