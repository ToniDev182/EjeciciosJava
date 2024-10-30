/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author usuario
 */
import java.util.Scanner; // Importa la clase Scanner para obtener entrada del usuario

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        // Solicita al usuario ingresar dos números enteros
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        // Muestra los números ingresados
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);

        // Solicita al usuario que seleccione una operación matemática
        System.out.println("Seleccione la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.print("Elija una opción (1-5): ");

        int opcion = scanner.nextInt();
        double resultado = 0;

        // Realiza la operación seleccionada y muestra el resultado
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            case 5:
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado de la potencia: " + resultado);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}