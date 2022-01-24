/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
       
        
        do {
            
             System.out.println("Escriba una nota");
             nota = scan.nextInt();
             
             if (nota < 0 || nota > 10){
                System.out.println("La nota ingresada es incorrecta");
             }else
                 
             {System.out.println("La nota ingresada es correcta"); 
                 break;
        }
            
        } while (nota < 0 || nota > 10);
        
    }
    
}
