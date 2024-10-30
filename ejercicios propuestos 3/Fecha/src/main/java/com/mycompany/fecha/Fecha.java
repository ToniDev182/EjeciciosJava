/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fecha;

/**
 *
 * @author 34639
 */
import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde la entrada estándar
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese el día, el mes y el año
        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();

        // Cerrar el objeto Scanner
        sc.close();

        // Validar la fecha
        boolean fechaValida = false;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (dia >= 1 && dia <= 31) {
                    fechaValida = true;
                }
                break;
            case 4: case 6: case 9: case 11:
                if (dia >= 1 && dia <= 30) {
                    fechaValida = true;
                }
                break;
            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    // Año bisiesto
                    if (dia >= 1 && dia <= 29) {
                        fechaValida = true;
                    }
                } else {
                    // Año no bisiesto
                    if (dia >= 1 && dia <= 28) {
                        fechaValida = true;
                    }
                }
                break;
            default:
                fechaValida = false;
        }

        // Mostrar el resultado
        if (fechaValida) {
            System.out.println("La fecha ingresada es válida.");
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }
    }
}
