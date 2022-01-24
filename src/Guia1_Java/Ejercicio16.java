/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, sum, contador; 
        sum = 0;
        contador = 0;
        
        do{
            System.out.println("Escriba un número");
            num = sc.nextInt();
            
            if (num > 0){
                sum = sum + num;
                contador = contador + 1;
            }else {
                contador = contador + 1;
            }
            
        }while (num != 0 && contador < 20); 
        
        if (num == 0){
            System.out.println("Se capturó el número 0");
        }
        System.out.println("El resultado de la suma es: " + sum);
    }
}
