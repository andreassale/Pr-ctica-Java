/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int contador = 0;
        
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = scan.nextInt();
        System.out.println("Ingrese un número para buscar dentro del vector");
        int num = scan.nextInt();
        
        int vector[] = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int) (Math.random() * tamaño);       
        }
        
        for (int i = 0; i < tamaño; i++) {
        System.out.print("[" + vector[i] + "]");
        }
        
        System.out.println("");
 
        for (int i = 0; i < tamaño; i++) {
             if (vector[i] == num){
                System.out.println("El numero elegido se encuentra en la posición [" + i + "]");
                contador ++;
             }
        }
        if (contador == 0){
            System.out.println("El numero elegido no se encuentra en el vector");
        }
    }
}
