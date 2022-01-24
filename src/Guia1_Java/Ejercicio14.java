/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        int num;
        int num1;
        int suma;
        
        suma = 0;
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Escriba un valor límite positivo");
            num = sc.nextInt();
            if (num < 1) {
                System.out.println("El numero ingresado es inválido");
            }
            
        }while (num < 1);
                
        do{
            System.out.println("Escriba valores para sumar");
            num1 = sc.nextInt();
            suma = suma + num1;
            
        }while (suma < num + 1);
        
    }
    
}
