/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.par;

/**
 *
 * @author 34639
 */import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde la entrada estándar
        Scanner sc = new Scanner (System.in);     // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");

        // Leer el número entero ingresado por el usuario
        int numero = sc.nextInt();

        // Cerrar el objeto Scanner
        sc.close();

        // Determinar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
    }
}

