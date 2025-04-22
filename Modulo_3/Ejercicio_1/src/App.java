import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Inventario inventario = new Inventario();
         Scanner scan = new Scanner(System.in);
         boolean salir = false;
         int opcion;
         System.out.println("----------------------------------------");
         System.out.println("Bienvenido a este inventario de productos");
         System.out.println("----------------------------------------");
         System.out.println("Por favor elija una de las siguientes opciones:");
         do {
            System.out.println("1. Mostrar Inventario");
            System.out.println("2. Buscar Producto");
            System.out.println("3. Agregar Producto");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Actualizar stock");
            System.out.println("6. Salir");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion)
         {
            case 1:
                inventario.showInventario();
                break;
                case 2:
                    System.out.println("Ingrese el nombre del producto a buscar: ");
                    String nombre = scan.nextLine();
                    inventario.buscarProducto(nombre);
                break;
                case 3:
                System.out.println("Ingrese el nombre del producto a agregar: ");
                String name = scan.nextLine();
                System.out.println("Ingrese la cantidad del producto a agregar: ");
                int cantidad = scan.nextInt();
                scan.nextLine();
                inventario.agregarProducto(name, cantidad);
                break;
                case 4:
                inventario.showInventario();
                System.out.println("Ingrese el nombre del producto a eliminar: ");
                String producto = scan.nextLine();
                inventario.eliminarProducto(producto);
                break;
                case 5:
                    System.out.println("ingrese el nombre del producto a actualizar:");
                    nombre = scan.nextLine();
                    System.out.println("Ingrese la nueva cantidad del producto: ");
                    int quanty = scan.nextInt();
                    inventario.actualizarCantidad(nombre,quanty);
                break;
                case 6:
                System.out.println("Gracias por usar este inventario de productos");
                salir = true;
                break;
                default:
                System.out.println("Opcion invalida");
                break;
         }
         pressEnter(scan);
        } while (!salir);

        scan.close();
    }

    private static void pressEnter(Scanner scan){
        System.out.println("Presione enter para continuar...");
        scan.nextLine();
    }
}
