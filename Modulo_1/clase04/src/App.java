import java.util.Scanner;
import ejercicios.*;

public class App {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        var salir = false;

        do {
            System.out.println("---------- Bienvenido ---------");
            System.out.println("A continuacion los ejercicios de la clase 4 por favor elija un ejercicio a ejecutar");
            System.out.println("1. Numero positivo, negativo o cero");
            System.out.println("2. Numero Mayor entre tres numeros");
            System.out.println("0. salir");

            System.out.print("Ingrese una opción: ");
            int opcion = entrada.nextInt(); 

            switch (opcion) {
                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    Ejercicio01.idNumero(); 
                    break;
                case 2:
                    Ejercicio02.numberMayor();
                    break;
                default:
                    System.err.println("Ingrese una opción válida");
                    break;
            }
        } while (!salir);

        entrada.close(); 
    }
}
