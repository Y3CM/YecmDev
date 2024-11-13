import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        showMenu(scanner);
    }

    private static void showMenu(Scanner scanner) {
        int opcion;
      do{  
        System.out.println("================================================================");
        System.out.println("=========================== Inicio de la Aplicación ===============================");
        System.out.println("================================================================");
        System.out.println("1. Pruebas del cilclo while");
        System.out.println("2. Pruebas del cilclo do-while");
        System.out.println("3. Pruebas del cilclo for");
        System.out.println("0. Salir de la aplicación");
        System.out.println("Ingrese su opción: ");
        opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1:
                whileTest();

                break; 
            case 2:

                doWhileTest();

                break;
            case 3:
                forTest();

                break;
            case 0:
                System.out.println("Hasta luego ...");
                break;

            default:
                System.err.println("Ingrese una opción valida");
                break;
        }
                
        pressEnter(scanner);
       } while (opcion != 0);
         
    }

    private static void pressEnter(Scanner scanner){
        System.out.println("Presione ENTER para continuar...");
        scanner.nextLine();
    }
    private static void doWhileTest() {
        System.out.println("lo que se ubica aqui se inicializa al menos uno ves asi no se cumpla la condicion");
        var counter = 5;
        do {
            System.out.println(counter);
            counter--;
        } while (counter > 0);
        System.out.println("Boom! " );
    }

    private static void forTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(++i);
        }
        System.out.println("you win!");
    }

    public static void whileTest() {
        var counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }
}
