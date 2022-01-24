/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
Ejemplo:


Como podemos observar nuestra submatriz P se encuentra en la matriz M en los
índices: 4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
 */
package Guia1_Java;

import java.util.Scanner; 

public class Ejercicio28 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int contador = 0;
        int contador1 = 0;
        int cont_igual = 0;
        int matriz_m[][] = new int [10][10];
        int matriz_p[][] = new int [3][3];
        int matriz_q[][] = new int [3][3];
        int vector_q[] = new int [9];
        int k = 0;
        int l = 0;
        int p = 0;
        int x = 0;
        
//      Llena y me muestra la matriz M
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                matriz_m[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print("[" + matriz_m[i][j] + "]");
            }
                System.out.println("");
        }
// -------------------------------------------------------------------------
// Llena y me muestra la matriz P
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
//                matriz_m[i][j] = (int) (Math.random() * 10);
                System.out.println("Ingrese los números de la segunda matriz ");
                matriz_p[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("[" + matriz_p[i][j] + "]");
            }
                System.out.println("");
        }
// ------------------------------------------------------------------------------------
//      Prueba para ver si las matrices son iguales
        
            for (int i = 0; i < 8; i++){
                for (int j = 0; j < 8; j++){
                       if (matriz_m[i][j] == matriz_p[0][0]){
                           contador = contador + 1;
                        }
                       if (contador == 1){
                           k = i;
                           l = j;
                           x = j++;
                           cont_igual++;
                           if (matriz_m[k][x] == matriz_p[0][1]){
                               cont_igual++;
                               x++;
                               if (matriz_m[k][x] == matriz_p[0][2]){
                                   cont_igual++;
                               }if (cont_igual == 3){
                                   break;
                               }
                            }
                       }
                       contador = 0;
                }
            }
// ----------------------------------------------------------------
// Cuando encuentra tres números consecutivos iguales a mi matriz P, guarda los 9 numeros en un vector
            for (int i = k; i < (k + 3); i++){
                 for (int j = l; j < (l + 3); j++){
                      vector_q[p] = matriz_m[i][j];
                      p++;
                 }
            }
// -------------------------------------------------------------------
// Ese vector lo paso a una matriz Q, la voy a usar para comparar mi matriz P
            
            p = 0;
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    matriz_q[i][j] = vector_q[p];
                    p++;
                }
            }
// ------------------------------------------------------------------------------
// Comparo las matrices P y Q. Si son iguales es porque mi matriz P está contenida en la matriz M.
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    if (matriz_p[i][j] == matriz_q[i][j]){
                        contador1++;
                    } 
                }
            }
                 
          if (contador1 == (3*3)){
              System.out.println("La matriz P está contenida en la matriz M");
              System.out.println("La ubicación de la matriz M que coincide con el primer elemento de la matriz P es: " + k + ", " + l);
           
          }else{
                 System.out.println("La matriz P NO está contenida en la matriz M");
               }
    }
}