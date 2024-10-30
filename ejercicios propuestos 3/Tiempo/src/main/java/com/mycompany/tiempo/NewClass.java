/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiempo;

/**
 *
 * @author 34639
 */

import java.util.Random; 


public class NewClass {
     public static void main(String[] args) {
         Random random = new Random (); 
         System.out.print ("un numero random");
         
         for (int i = 0; i <= 100; i++){
             int  numeroaletorio = random.nextInt(1000);
             
             if (numeroaletorio % 3==0){
                 System.out.print(numeroaletorio);
         }
     }
    
}
}