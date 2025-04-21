import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Inventario inventario = new Inventario();
         Scanner scan = new Scanner(System.in);
       System.out.println("Bienvenido al inventario inserta los productos a continuación:");
        System.out.println("Producto: ");
        String producto = scan.nextLine();
        System.out.println("Cantidad: ");
        int cantidad = scan.nextInt();
        inventario.agregarProducto(producto, cantidad);
        inventario.showInventario();

        scan.close();
    }
}
