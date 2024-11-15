package clase03;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("A continuacion ingrese dos numeros enteros con los cuales se realizaran las siguientes operaciones: ");
        System.out.println("Suma, Resta, Multiplicación, División");
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        scanner.close();
        var suma = num1 + num2;
        var resta = num1 - num2;
        var multiplicacion = num1 * num2;
        var division = num1 / num2;

        System.out.println( "la suma de "+ num1 + " + " + num2 + " = "+ suma);
        System.out.println( "la resta de "+ num1 + " - " + num2 + " = "+ resta);
        System.out.println( "la multiplicaion de "+ num1 + " x " + num2 + " = "+ multiplicacion);
        System.out.println( "la division de "+ num1 + " / " + num2 + " = "+ division);
    }
}
