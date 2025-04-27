import java.util.Scanner;

public class App {
    public static void main(String[] args){
        var clientes = new GestionClientes();
        var reservas = new GestionReservas(clientes);
        var salir = false;        
        var scan = new Scanner(System.in);
        

        do{
            System.out.println("-------------------------------------");
            System.out.println("Sistema de Gestión de Reservas de Hotel");
            System.out.println("-------------------------------------\n");

            System.out.println("1. Gestion clientes");
            System.out.println("2. Gestion reservas");
            System.out.println("3. Salir");

            var opcion = scan.nextInt();
        scan.nextLine();
        switch(opcion){
            case 1:
                menuGestionClientes(scan, clientes);
             break;
            case 2:
                menuGestionReservas(scan, reservas);
            break;
            case 3:
            System.out.println("¡¡¡ Hasta pronto !!!");
            salir = true;
            pressEnter(scan);

            break;
            default:
            System.out.println("Opcion no valida");
            break;
        }
            

        } while(!salir);
        ;
        scan.close();
     
    }

     private static void pressEnter(Scanner scan){
        System.out.println("Presione enter para continuar...");
        scan.nextLine();
       }

       private static void menuGestionClientes(Scanner scan, GestionClientes clientes){
           var Volver = false;
         
           while (!Volver) {
                System.out.println("Gestion de clientes");
               System.out.println("1. Registrar cliente");
               System.out.println("2. Buscar cliente");
               System.out.println("3. Mostrar clientes");
               System.out.println("4. Volver al menu principal");
               var opcion = scan.nextInt();
               scan.nextLine();
               switch(opcion){
                   case 1:
                System.out.println("Nombre del cliente: ");
                var clientName = scan.nextLine();
                System.out.println("ID del cliente: ");
                var clientID = scan.nextLine();
                clientes.registrarCliente(clientID, clientName);
                break;
                case 2:
                System.out.println("ID del cliente a buscar: ");
                var cliente = scan.nextLine();
                System.out.println(clientes.buscarCliente(cliente));
                pressEnter(scan);

                break;
            case 3:
                clientes.showClientes();
                pressEnter(scan);

                break;
            case 4:
                Volver = true;
            break;
            default:
                System.out.println("Opcion no valida");
            break;
        }
           }
       }

       private static void menuGestionReservas(Scanner scan, GestionReservas reservas){
        var volver = false;
        
        while(!volver){

            System.out.println("Gestion Reservas");
            System.out.println("1. Registrar Reserva");
            System.out.println("2. Buscar Reserva");
            System.out.println("3. Mostrar Reservas");
            System.out.println("4. volver");
            var opcion = scan.nextInt();
            scan.nextLine();

            switch(opcion){
                case 1:
                System.out.println("Id del cliente que quiere reservar en el hotel: ");
                var clienteId= scan.nextLine();
                System.out.println("Inserte fecha (dd/mm/aa) de inicio de la reservación: ");
                var fechaInicio = scan.nextLine();
                System.out.println("Fecha (dd/mm/aa) de finalización de reserva: ");
                var fechaFin = scan.nextLine();
                try{
                    reservas.crearReserva(clienteId, fechaInicio, fechaFin);
                }catch(ReservaInvalidaException e){
                    System.out.println("Error al gestionar la reserva "+e.getMessage());
                }
                break;
                case 2:
                    System.out.println("ID del cliente para buscar reservas:");
                    var clienteId2 = scan.nextLine();
                    System.out.println("Fecha de inicio de la reserva:");
                    var fechaIni = scan.nextLine();
                    System.out.println(reservas.buscarReserva(clienteId2, fechaIni));
                    pressEnter(scan);

                    break;
                    case 3:
                    reservas.showReservas();
                    pressEnter(scan);
                    break;
                    
                case 4:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción invalida intente de nuevo");
                    break;
            }
        }
        
    }

}
