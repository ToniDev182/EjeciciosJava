/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplo;

/**
 *
 * @author 34639
 */
import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde la entrada estándar
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número entero
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = sc.nextInt();

        // Solicitar al usuario que ingrese el segundo número entero
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = sc.nextInt();

        // Cerrar el objeto Scanner
        sc.close();

        // Determinar si el segundo número es múltiplo del primero
        if (numero2 % numero1 == 0) {
            System.out.println(numero2 + " es múltiplo de " + numero1 + ".");
        } else {
            System.out.println(numero2 + " no es múltiplo de " + numero1 + ".");
        }
    }
}