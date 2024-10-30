/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.correo;

/**
 *
 * @author miAsus
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Correo {
    public static void main(String[] args) {
        // Cadena de caracteres que contiene un correo electrónico
        String texto = "Hola me llamo Antonio y mi correo es atienzajobs16@gmail.com, ponte en contacto.";

        // Patrón de expresión regular para encontrar correos electrónicos
        String patronCorreo = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";

        // Compilar el patrón
        Pattern pattern = Pattern.compile(patronCorreo);

        // Crear un objeto Matcher para buscar coincidencias en el texto
        Matcher matcher = pattern.matcher(texto);

        // Buscar y mostrar todos los correos electrónicos en la cadena de caracteres
        while (matcher.find()) {
            String correo = matcher.group();
            System.out.println("Correo encontrado: " + correo);
        }
    }
}
