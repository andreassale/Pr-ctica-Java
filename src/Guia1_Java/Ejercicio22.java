/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
package Guia1_Java;

public class Ejercicio22 {
    public static void main(String[] args){
        int vector[] = new int[101];
        
        for (int i = 100; i >= 0; i--){
            vector[i] = i;
            System.out.print("[" + vector [i] + "]" );
        }
    }
}
