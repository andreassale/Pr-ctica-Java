/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1_Java;

public class Ejemplo_para_18 {
       public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) { 
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                             System.out.print(i != 3 ? i : "E");
                             System.out.print(j != 3 ? j : "E");
                             System.out.println(k != 3 ? k : "E");     
                             
//                           Acá usa print para escribir en la misma línea y 
//                           println para que la siguiente línea sea abajo
                }
            }
        }
    }
}
    
