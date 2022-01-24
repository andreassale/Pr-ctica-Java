/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla. */

package Guia1_Java;

import java.util.Scanner;

public class Ejercicio03 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresá tu nombre");
        String nombre = scan.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);
        
    }
    
    
}
