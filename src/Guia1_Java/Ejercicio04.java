/* Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas.*/

package Guia1_Java;

import java.util.Scanner;
        
public class Ejercicio04 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escriba una frase");
        String frase = scan.nextLine();
        
        System.out.println("La frase ingresada en mayúsculas es : " + frase.toUpperCase());
        System.out.println("Y la misma frase en minúsculas es : " + frase.toLowerCase());

        
    }
    
    
}
