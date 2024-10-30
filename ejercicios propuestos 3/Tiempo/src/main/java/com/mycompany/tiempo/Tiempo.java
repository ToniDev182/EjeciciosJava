/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiempo;

/**
 *
 * @author 34639
 */
import java.util.Scanner;

public class Tiempo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde la entrada estándar
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tiempo en segundos
        System.out.print("Ingrese el tiempo en segundos: ");
        int t = sc.nextInt();

        // Cerrar el objeto Scanner
        sc.close();

        // Calcular las horas, minutos y segundos
        int horas = t / 3600;
        int minutos = (t % 3600) / 60;
        int segundos = t % 60;

        // Mostrar el resultado
        System.out.println("Tiempo en horas, minutos y segundos: " + horas + "h " + minutos + "m " + segundos + "s");
    }
}
