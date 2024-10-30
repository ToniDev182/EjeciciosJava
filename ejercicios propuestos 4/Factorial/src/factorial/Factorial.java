/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author Antonio Atienza
 */
public class Factorial {
    public static void main(String[] args) {
        // Comprobar si se proporciona un solo argumento en la línea de comandos
        if (args.length != 1) {
            System.out.println("Uso: java DescomposicionFactorial <número>");
            return; // Salir del programa si no se proporciona el número adecuado de argumentos
        }

       
            // Convertir el argumento a un número entero
           {  int numero = Integer.parseInt(args[0]);

            // Mostrar un encabezado indicando de qué número se está realizando la descomposición factorial
            System.out.println("Descomposicion factorial en factores primos de " + numero + ":");

            // Factorización del número en factores primos
            for (int i = 2; i <= numero; i++) { //se inicia en dos porque uno no ses primo
                while (numero % i == 0) { // si no hay residuo en la division (i) es divisor de (numero)
                    // Si el número es divisible por i, mostrar i como un factor primo
                    System.out.print(i);
                  
                    numero /= i; //se realiza para reducir el número que estamos descomponiendo (numero) a medida que encontramos sus factores primos. 
                                 // Esto es esencial para el proceso de factorización
                    if (numero != 1) { // verificamos que numero no es igual a uno eso quiere decir que aun hay mas factores primos por llegar 
                        System.out.print(" * "); // Mostrar un "*" si hay más factores
                    }
                }
            }

        
        }
    }
}
