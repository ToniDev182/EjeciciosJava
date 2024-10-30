/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fragmento;

import java.io.IOException;

/**
 *
 * @author miAsus
 */
public class Fragmento {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Introduzca un texto");
        while (true){
           int letra = System.in.read(); 
            System.out.append((char)letra);
            
            // Es un bucle while que se replica infinitamente intruciendo un un caracter cualquiera que se inserta por pantalla y repiendolo
            //para ello es necesario importar la excepcion "IOExceptio", con esa modificación el programa deberia funiconar correctamente. 
            
        }
    }
}
