 /*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int euros;
        String moneda;
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        euros = scan.nextInt();
        do{
        System.out.println("Ingrese la moneda en que desea hacer la conversión: libra/dolar/yen");
        moneda = scan.next();
        }while(!moneda.equals("libra") && !moneda.equals("dolar") && !moneda.equals("yen"));
        convert(euros, moneda);
        
    }
    public static void convert(int euros, String moneda){
   
        switch (moneda){
            case "libra":
                System.out.println("El valor por la conversión de Euros a Libras es: " + euros * 0.86);
                break;
            case "dolar":
                System.out.println("El valor por la conversión de Euros a Dólares es: " + euros * 1.28611);
                break;
            case "yen":
                System.out.println("El valor por la conversión de Euros a Yenes es: " + euros * 129.852 );
                break;
            default:
                System.out.println("Usted no ha ingresado una moneda válida");
                break;
        }
        
    }
}
