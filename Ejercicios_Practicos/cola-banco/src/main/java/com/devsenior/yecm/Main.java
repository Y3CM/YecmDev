package com.devsenior.yecm;

import java.util.*;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ClientesService clientesService = new ClientesService();

        while (true) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> {
                    int id = leerEntero("Ingrese el id del cliente: ");
                    String name = leerTexto("Ingrese el nombre del cliente: ");
                    clientesService.add(new Cliente(id, name));
                }
                case 2 -> {
                    System.out.println("Eliminando cliente de la cola de espera...");
                    clientesService.delete();
                }
                case 3 -> clientesService.show();
                case 4 -> {
                    System.out.println("Saliendo del programa...");
                    scan.close();
                    return; 
                }
                default -> System.out.println("⚠️ Opción no válida, intente de nuevo.");
            }

            pressEnterToContinue();
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n=== Bienvenido al Banco Nacional Yecm ===");
        System.out.println("1. Agregar Cliente a la cola de espera");
        System.out.println("2. Eliminar Cliente de la cola de espera");
        System.out.println("3. Mostrar Clientes de la cola de espera");
        System.out.println("4. Salir");
        System.out.println("=========================================");
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada inválida. Debe ingresar un número.");
            }
        }
    }

    private static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scan.nextLine().trim();
    }

    private static void pressEnterToContinue() {
        System.out.println("\nPresione ENTER para continuar...");
        scan.nextLine();
    }
}
