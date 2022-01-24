/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package Guia1_Java;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int correctas, incorrectas;
        String cadenas, FDE;

        FDE = "&&&&&";
        correctas = 0;
        incorrectas = 0;

        do {
            System.out.println("Ingrese cadenas de un máximo de 5 caracteres de largo, el primer\n"
                    + "carácter tiene que ser X y el último tiene que ser una O.");
            cadenas = scan.next();
            if (cadenas.substring(0, 1).equals("x") && cadenas.substring(4, 5).equals("o") && cadenas.length() == 5) {
                correctas = correctas + 1;
                System.out.println("Secuencia correcta");
            } else if (cadenas.equals(FDE)) {
                System.out.println("Final del envío");
            } else {
                System.out.println("Secuencia incorrecta");
                incorrectas = incorrectas + 1;
            }
        } while (!cadenas.equals(FDE));

        System.out.println("La cantidad de lecturas correctas fue de: " + correctas);
        System.out.println("La cantidad de lecturas incorrectas fue de: " + incorrectas);
    }
}
