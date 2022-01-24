/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escriba una frase o palabra de hasta 8 caracteres de longitud");
        String frase = scan.nextLine();
        
        if (frase.length() == 8) {
           System.out.println("Correcto");
        }
        else {
            System.out.println("Falso");
        }
        
    }
    
}
