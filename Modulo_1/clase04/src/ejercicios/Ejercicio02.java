package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
    public static void numberMayor() {
        var scan = new Scanner(System.in);

        System.out.println("A continuacion inserte 3 numeros diferentes: ");
        System.out.println("Ingrese primer numero: ");
        int number01 = scan.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int number02 = scan.nextInt();
        System.out.println("Ingrese tercer numero: ");
        int number03 = scan.nextInt();
       
        if (number01 > number02) {
            if (number01 > number03) {
                System.out.println("El " + number01 +" es el numero mayor");
            }
        } else {
            if (number02 > number03) {
                System.out.println("El " + number02 +" es el numero mayor");
            }else {
                System.out.println("El " + number03 +" es el numero mayor");
            }
        }
        
    };
}
