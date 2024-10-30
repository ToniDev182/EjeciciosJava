/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circunferencia;

/**
 *
 * @Antonio Atienza 
 */


    import java.util.Scanner;

public class Circunferencia {
    // Función para calcular el área de un círculo
    public static double calcularArea(double radio) {
        double pi = 3.1416;
        return pi * radio * radio; // Fórmula del área: pi * radio * radio
    }

    // Función para calcular la longitud de la circunferencia
    public static double calcularCircunferencia(double radio) {
        double pi = 3.1416;
        return 2 * pi * radio; // Fórmula de la circunferencia: 2 * pi * radio
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble(); // Leer el radio ingresado por el usuario
        
        // Calcular el área llamando a la función calcularArea
        double area = calcularArea(radio);
        System.out.println("Área del círculo: " + area); // Mostrar el área
        
        // Calcular la circunferencia llamando a la función calcularCircunferencia
        double circunferencia = calcularCircunferencia(radio);
        System.out.println("Longitud de la circunferencia: " + circunferencia); // Mostrar la longitud de la circunferencia
    }
}
