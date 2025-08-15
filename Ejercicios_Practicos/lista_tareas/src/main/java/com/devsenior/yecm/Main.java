package com.devsenior.yecm;

import java.util.Scanner;

public class Main {
    private static boolean salir = false;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TareasService service = new TareasService();

        do {
            System.out.println("Sistema Gestion de tareas");
            System.out.println("Bienvenido por favor elige una opcion para continuar");
            System.out.println("1. Agregar tareas");
            System.out.println("2. Listar tareas activas");
            System.out.println("3. Listar tareas finalizadas");
            System.out.println("4. Finalizar tareas");
            System.out.println("5. salir");

            var opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la tarea a realizar");
                    var title = scan.nextLine();
                    System.out.println("Describe la tarea a realizar");
                    var description = scan.nextLine();
                    Tarea tarea = new Tarea(title, description);
                    service.addTarea(tarea);
                    break;
                case 2:
                    service.showTareas();
                    break;
                case 3:
                    service.showTareasFinal();
                    break;
                case 4:
                    service.showTareas();
                    System.out.println("Ingresa el numero de la tarea a eliminar");
                    var indice = scan.nextInt();
                    service.deleteTarea(indice);
                    break;
                case 5:
                System.out.println("Gracias Hasta la proxima...");
                    salir = true;
                    break;
                default:
                System.out.println("ingrese una opcion valida");
                    break;
            }
            pressEnter(scan);

        } while (!salir);
        scan.close();
    }
    public static void pressEnter(Scanner scan){
        System.out.println("Press enter para continuar..");
        scan.nextLine();
    }
}