/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mes;

/**
 *
 * @author miAsus
 */
import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Por favor, ingresa un número (1-12) para determinar el mes correspondiente: ");
        int numero = input.nextInt();

        String mes;

        switch (numero) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "Número no válido, por favor ingresa un número entre 1 y 12.";
                break;
        }

        System.out.println("El número " + numero + " corresponde a " + mes);

        input.close();
    }
}
