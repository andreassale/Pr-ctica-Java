/*
Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio07 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escribir dos números enteros");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        System.out.println("El mayor de los dos números ingresados es: " + Math.max(num1, num2));
    }
    
}
