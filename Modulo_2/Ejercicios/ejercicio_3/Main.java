package Ejercicios.ejercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan =  new Scanner(System.in);
      boolean salir = false;  

      List<MetodoPago> metodoPagos = new ArrayList<>();

      do {
        System.out.println("*************************************");
        System.out.println("Bienvenido al sistema de pago de Yecm");
        System.out.println("*************************************");
        System.out.println("A continuación debe elegir el metodo de pago para procesar el pago");
        System.out.println("1. Bitcoin");
        System.out.println("2. Tarjeta de credito");
        System.out.println("3. Tarjeta Regalo");
        System.out.println("4.Transferencia Bancaria");
        System.out.println("5. PayPal");
        System.out.println("6. Salir");
        
        int opcion = scan.nextInt();
        
        switch (opcion) {
            case 1:
               metodoPagos.add(new Bitcoin());
                procesarPago(scan, metodoPagos);
                break;
            case 2:
               metodoPagos.add(new TarjetaCredito());
               procesarPago(scan, metodoPagos);
                break;
            case 3:
                metodoPagos.add(new TarjetaRegalo());
                procesarPago(scan, metodoPagos);
                break;
            case 4:
                metodoPagos.add(new TransferenciaBancaria());
                procesarPago(scan, metodoPagos);
               break;
            case 5:
                metodoPagos.add(new PayPal());
                procesarPago(scan, metodoPagos);
               break;
            case 6:
                salir = true;
                break;
                default:
                System.err.println("Opción invalida");
            }
            pressEnter(scan);
      } while (!salir);
    }

    private static void procesarPago(Scanner scan, List<MetodoPago> metodoPagos) {
        for (MetodoPago metodoPago : metodoPagos) {
            System.out.println(metodoPago.obtenerDetalles());
            System.out.println("ingrese monto a procesar");
            double monto = scan.nextDouble();
            scan.nextLine();
            metodoPago.procesarPago(monto);
        }

    }

    public static void pressEnter(Scanner scan) {
        System.out.println("Presione ENTER para salir...");
        scan.nextLine();
    }
}
