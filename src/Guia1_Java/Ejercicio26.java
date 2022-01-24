/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -A t . La matriz traspuesta de
una matriz A se denota por A t y se obtiene cambiando sus filas por columnas (o
viceversa).
Ejemplo:
[0] [-2] [4]   [0] [2] [4,]
[2] [0] [2]    [-2][0][-2]
[-4][-2][0]    [4] [2][0]
En este caso la matriz es anti simétrica.
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int cont_igualdad = 0;
        
        System.out.println("Ingrese el tamaño de la matriz cuadrada");
        int tamaño = scan.nextInt();
        
        int matriz[][] = new int [tamaño][tamaño];
        
        for (int i = 0; i < tamaño; i++){
            for (int j = 0; j < tamaño; j++){
                matriz[i][j] = (int) (Math.random() *30);
//              System.out.println("Ingrese un valor");
//              matriz[i][j] = scan.nextInt();
//             (Esto es para chequear el ejemplo del problema)
            }
        }
        for (int i = 0; i < tamaño; i++){
            for (int j = 0; j < tamaño; j++){
                 System.out.print("[" + matriz[i][j] + "]");
            }
                 System.out.println("");
        }
                 System.out.println("");

        for (int j = 0; j < tamaño; j++){
            for (int i = 0; i < tamaño; i++){
                 System.out.print("[" + matriz[i][j] + "]");
                 if (matriz[i][j] == matriz[j][i] * -1){
                     cont_igualdad ++;
                 }
            }
            System.out.println("");
        }
        if (cont_igualdad == tamaño * tamaño){
            System.out.println("La matriz es antisimétrica");
        }else{
            System.out.println("La matriz no es antisimétrica");
        }   
    } 
}
