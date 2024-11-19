package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    public static void idNumero(){
        var scan = new Scanner(System.in);

        System.out.println("inserte un numero para verificar si es negativa o positivo");
         int numero = scan.nextInt();
         scan.nextLine();
         scan.close();

         if (numero == 0) {
            System.out.println("el numero ingresado es 0");
            return;
         }if (numero < -1 && numero != 0) {
            System.out.println("el numero ingresado es Negativo");
         } else {
            System.out.println("el numero ingresado es Positivo");
         }
    }
}
