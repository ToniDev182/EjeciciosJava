/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primosrango;

/**
 *
 * @author Antonio Atienza 
 */
public class PrimosRango {
    public static void main(String[] args) {
        if (args.length != 2) {
 }

        {
            // Convertir los argumentos a valores enteros
            int valorMinimo = Integer.parseInt(args[0]);
            int valorMaximo = Integer.parseInt(args[1]);

            // Asegurarse de que el valor mínimo sea al menos 2
            if (valorMinimo <= 2); 

            System.out.println("Números primos entre " + valorMinimo + " y " + valorMaximo + ":");

            // Iterar a través del rango de valores y verificar si son primos
            for (int numero = valorMinimo; numero <= valorMaximo; numero++) {
                if (esPrimo(numero)) {
                    System.out.print(numero + " ");
                }
            }

            System.out.println();
   
        }
    }

    // Función que verifica si un número dado es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
int i = 5;
        while (i * i <= numero) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }
    }



