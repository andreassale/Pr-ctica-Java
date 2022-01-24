/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número.
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escriba un número entero");
        int num = scan.nextInt();
        
        System.out.println("El doble de ese número es: " + num * 2);
        System.out.println("El triple de ese número es: " + num * 3);
        System.out.println("La raíz cuadrada de ese número es: " + Math.sqrt(num));
        
    }
    
}
