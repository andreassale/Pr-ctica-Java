/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escriba el tamaño del cuadrado");
        int tamaño = scan.nextInt();

        for (int i = 0; i < tamaño; i++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int i = 0; i < tamaño - 2; i++) {
            System.out.print("*");
            for (int j = 2; j < tamaño; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println(" ");
        }
        for (int i = 0; i < tamaño; i++) {
            System.out.print("*");
        }
    }
}
