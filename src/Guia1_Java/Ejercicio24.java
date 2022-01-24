/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia1_Java;

import java.util.Scanner;
       
public class Ejercicio24 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int cifra = 0;
        int cifra1 = 0;
        int cifra2 = 0;
        int cifra3 = 0;
        int cifra4 = 0;
        int cifra5 = 0;
        int valor;
        
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = scan.nextInt();
        
        int vector[] = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int) (Math.random() * 100000);       
        }
//        (esto no sé si lo pide o no, muestra el vector)
//        for (int i = 0; i < tamaño; i++) {
//        System.out.print("[" + vector[i] + "]");
//        }
//        System.out.println("");
        
        for (int i = 0; i < tamaño; i++) {
             valor = vector[i];
//             System.out.println("El valor de valor es: " + valor); 
//             (esto no me lo pide el ej. pero sirve para chequear)
             do{
                valor = valor/10;
//              System.out.println("El valor de valor es: " + valor);
//              (esto no me lo pide el ej. pero sirve para chequear)
                cifra ++;
             }while(valor > 0);
//         System.out.println("El valor de la cifra es: " + cifra);
//        (esto no me lo pide el ej. pero sirve para chequear)
            switch (cifra){
                case 1:
                    cifra1++;
                    break;
                case 2:
                    cifra2++;
                    break;
                case 3:
                    cifra3++;
                    break;
                case 4:
                    cifra4++;
                    break;
                case 5:
                    cifra5++;
                    break;
                default:
                    System.out.println("Al menos 1 número tiene cifras no válidas para este ejercicio");
             }
            cifra = 0; 
//          (importante que el coontador vuelva a 0"
        }
            System.out.println("En el vector hay " + cifra1 + " números de 1 cifra.");
            System.out.println("En el vector hay " + cifra2 + " números de 2 cifra.");
            System.out.println("En el vector hay " + cifra3 + " números de 3 cifra.");
            System.out.println("En el vector hay " + cifra4 + " números de 4 cifra.");
            System.out.println("En el vector hay " + cifra5 + " números de 5 cifra.");
    }  
}
