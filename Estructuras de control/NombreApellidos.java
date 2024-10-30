/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nombreapellidos;

/**
 *
 * @author usuario
 */

import java.util.Scanner; //Importar la clase Scanner.

public class NombreApellidos {

    public static void main(String[] args) {
        // Crea un Scanner para la entrada de datos del usuario
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Ingrese Apellido 1: "); // solicita el apellido1 
        String apellido1 = scanner.nextLine(); // Lee la entrada apellido uno y almacenala
        
        System.out.print ("Ingrese Apellido 2: "); // solicita el apellido 2
        String apellido2 = scanner.nextLine(); // Lee la entrada apellido dos y almacenala
        
        System.out.print ("Ingrese Nombre: "); //Solicita Nombre
        String nombre = scanner.nextLine();// Lee la entrada Nombre almacenala
        
        System.out.println("-------------------------------------------------"); // linea de separación 
        
        System.out.println("Apellido 1: "+apellido1); // Muestra apellido 1
        System.out.println("Apellido 2: "+apellido2); //Muestra apellido 2
        System.out.println("Nombre: "+nombre); // Muestra Nombre
        
    }
}
