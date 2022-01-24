/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package Guia1_Java;

public class Ejercicio20 {
    public static void main(String[] args){
        
        for (int i = 0; i < 5; i++){
            int numero = (int) (Math.random() * 20 + 1);
            System.out.print(numero);
            for (int j = 1; j < numero + 1; j++){
            System.out.print("*");
            }  
            System.out.println("");
        }
    }
}
