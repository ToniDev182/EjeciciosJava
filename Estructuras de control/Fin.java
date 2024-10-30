/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fin;

/**
 *
 * @author usuario
 * 
 */

import java.util.Scanner; // Importamos la clase para leer la entrada del ususario

public class Fin {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese texto (esriba )'fin'para finalizar:"); 
        
        String entrada = ""; // Inicializa una variable para almacenar la entrada del usuario
        
        
// Utilizamaos un bucle wile para continuar solicitando entrada hasta que se ingrese fin

     while (!entrada.equals("fin")) {
          entrada = scanner.nextLine(); // lee la entrada de usuario y almacena la variable entrada.
    
          if (entrada.equals("fin")) {
              System.out.println("texto insertado "+ entrada);
          }
}

System.out.println ( "Fin del programa");

    }
}
