/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n, num, suma_d_p, suma_d_s, suma_d_p1, suma_d_s1;
        suma_d_p = 0;
        suma_d_s = 0;
   
        int matriz[][] = new int [3][3];
        int sumar_f[] = new int [3];
        int sumar_c[] = new int [3];
           
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                do{
                System.out.println("Ingresar números entre el 1 y 9");
                num = scan.nextInt();
                   if (num < 1 || num > 9){
                      System.out.println("Número inválido. Ingresar números entre el 1 y 9.");
                    }else{
                      matriz[i][j] = num;
                   }
                }while(num < 0 || num > 9);
            }
        } 
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                 System.out.print("[" + matriz[i][j] + "]");
            }
                 System.out.println("");
        }
        
       sumar_filas(matriz, sumar_f);
       sumar_columnas(matriz, sumar_c);
       suma_d_p1 = suma_diagonal_p(matriz, suma_d_p);
       suma_d_s1 = suma_diagonal_s(matriz, suma_d_s);
       igualdad_valores(sumar_f, sumar_c, suma_d_p1, suma_d_s1);
}
 
    public static void sumar_filas(int matriz[][], int sumar_f[]){
        int suma, contador;
        suma = 0;
        contador = 0;
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                suma = suma + matriz[i][j];
            }
            for (int k = contador; k < contador+1; k++){
                sumar_f[k]= suma;
            }
            contador = contador + 1;
            suma = 0;
        }
    }
    
    public static void sumar_columnas(int matriz[][], int sumar_c[]){
        int suma, contador;
        suma = 0;
        contador = 0;
        
        for (int j = 0; j < 3; j++){
            for (int i = 0; i < 3; i++){
                suma = suma + matriz[i][j];
            }
            for (int k = contador; k < contador+1; k++){
                sumar_c[k] = suma;  
            }
            contador = contador + 1;
            suma = 0;
        }
    }
    
    public static int suma_diagonal_p(int matriz[][], int suma_d_p){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (i == j){
                suma_d_p = suma_d_p + matriz[i][j];
                }
            }
        }
            return suma_d_p;
    }
    
    public static int suma_diagonal_s(int matriz[][], int suma_d_s){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (i + j == 3-1){
                suma_d_s = suma_d_s + matriz[i][j];
                }
            }
        }  
            return suma_d_s;
    }
     
    public static void igualdad_valores(int sumar_f[], int sumar_c[], int suma_d_p1, int suma_d_s1){
        boolean igualdad;
        igualdad = true;
        
        for (int i = 0; i < 3; i++){
            if (sumar_f[i] == sumar_c[i]){
                if(suma_d_p1 == suma_d_s1){
                   if (suma_d_s1 == sumar_f[i]){
                   }
                }
                igualdad = true;
            }else{
                igualdad = false;
            }  
        }
        if (igualdad == true){
            System.out.println("El cuadrado es mágico! la suma de sus filas, columnas y diagonales es igual, es: " + suma_d_p1);
        }if(igualdad == false){
            System.out.println("El cuadrado NO es mágico! la suma de sus filas, columnas y diagonales no tienen el mismo valor");
        }
    } 
}
