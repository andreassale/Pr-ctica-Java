/*
Crear un programa que dado un numero determine si es par o impar.
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escriba un número entero");
        int num = scan.nextInt();
        
        if (num%2==0)
            System.out.println("El número es par");
        else
            System.out.println("El número es impar");
    }
    
}
