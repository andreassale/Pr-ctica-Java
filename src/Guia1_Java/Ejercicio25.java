/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la
muestre ordenada por sus columnas.
 */
package Guia1_Java;

public class Ejercicio25 {
    public static void main(String[] args){
        
        int matriz[][] = new int [4][4];
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = (int) (Math.random() *30);
            }
        }
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
                System.out.println("");
        }
    } 
}
