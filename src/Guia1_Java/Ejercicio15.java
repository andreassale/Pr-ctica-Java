/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int opción;
        int contador;
        String salir;

        contador = 0;

        System.out.println("Escribir dos números enteros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        do {

            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");

            opción = sc.nextInt();

            switch (opción) {
                case 1:
                    System.out.println("La suma de los dos números es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta entre los dos números es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los dos números es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división entre los dos números es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir = sc.next();
                    salir = salir.toLowerCase();
                    if ("s".equals(salir)) {
                        System.out.println("Usted ha salido del programa");
                        contador = contador + 1;
                        break;
                    } else {
                        System.out.println("Vuelva a elegir una opción");
                        break;
                    }
                default:
                    System.out.println("Usted no ha ingresa una opción válida");
                    System.out.println("Vuelva a elegir una opción");
                    break;

            }
        } while (opción < 5 || contador != 1);

    }
}
