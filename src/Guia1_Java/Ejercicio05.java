/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Guia1_Java;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Ecriba la teperatura actual en grados centígrados");
       double temp_grados = scan.nextDouble();
       
       double temp_fahr; 
       temp_fahr = 32 + (9 * temp_grados / 5);
       
       System.out.println("La temperatura ingresada convertida a Fahrenheit es: " + temp_fahr);
       
    }
    
}
