/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.
 */
package Guia1_Java;

import java.util.Scanner;
        
public class Ejercicio11 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escriba una frase o palabra");
        String frase = scan.nextLine();
        
        if (frase.substring(0, 1).equals("a")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
   
    }
    
}
