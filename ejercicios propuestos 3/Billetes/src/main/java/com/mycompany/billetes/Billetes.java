/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.billetes;

/**
 *
 * @author Antonio Atienza
 */
import java.util.Scanner;

public class Billetes {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde la entrada estándar
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese el importe
        System.out.print("Ingrese el importe: ");
        int importe = sc.nextInt();

        // Definir los valores de los billetes disponibles
        int[] valoresBilletes = {100, 50, 20, 10, 5};

        // Inicializar una variable para contar los billetes
        int billetes = 0;

        // Calcular los billetes necesarios
        for (int valorBillete : valoresBilletes) {
            if (importe >= valorBillete) {
                int cantidadBilletes = importe / valorBillete;
                billetes += cantidadBilletes;
                importe -= cantidadBilletes * valorBillete;
            }
        }

        // Mostrar el resultado
        System.out.println("Mínimo número de billetes: " + billetes);
        System.out.println("Cantidad sobrante: " + importe + " euros.");

        // Cerrar el objeto Scanner
        sc.close();
    }
}
