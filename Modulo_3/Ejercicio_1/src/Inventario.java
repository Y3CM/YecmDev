import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Inventario {

 List<Producto> productos;
Scanner scan = new Scanner(System.in);

public Inventario(){
    productos = new ArrayList<>();
}


public void showInventario(){
   if (!isEmpty(productos)) {
       for (Producto producto : productos) {
           System.out.println("----------------------------------------");
           System.out.println("Productos en el inventario:");
           System.out.println(producto);
       }
   }
    
}

public void buscarProducto(String nombre){
    boolean encontrado = false;
    if (!isEmpty(productos)) {
        while (!encontrado) {
            try {
                for(Producto producto : productos){
                    if(producto.getNombre().equalsIgnoreCase(nombre)){
                        System.out.println(producto);
                        encontrado = true;
                        break;
                    } 
                }
                if (!encontrado) {
                    throw new ProductoNoEncontradoException("Producto no encontrado");
                }
        
            } catch (ProductoNoEncontradoException e) {
                System.out.println(e.getMessage());
                e.printStackTrace(System.err);
                System.out.println("Intente nuevamente.");
            }
            System.out.println("Ingrese el nombre del producto a buscar: ");
            nombre = scan.nextLine();
        }
    }
}

public void agregarProducto(String producto, int cantidad){
    productos.add(new Producto(producto, cantidad));
}

public void eliminarProducto(String nombre){
try {
    for (Producto producto : productos) {
        if (producto.getNombre().equalsIgnoreCase(nombre)) {
            productos.remove(producto);
            System.out.println("Producto eliminado: " + producto);
            return;
        } else {
            throw new ProductoNoEncontradoException("Producto no encontrado");
        }
    }
} catch (ProductoNoEncontradoException e) {
    System.out.println(e.getMessage());
}
}

public void actualizarCantidad(String nombre,int cantidad){
    for (Producto producto : productos) {
        try {
           if (producto.getNombre().equalsIgnoreCase(nombre)) {
               if (cantidad > 0) {
                   producto.setCantidad(cantidad);
                   System.out.println("Cantidad actualizada: " + producto);
                   break;
               } else{
                   throw new CantidadInvalidaException("La cantidad no puede ser negativa");
               }
           } else{
            throw new ProductoNoEncontradoException("Producto no encontrado");
           }
            
           
        } catch (CantidadInvalidaException e) {
            System.out.println(e.getMessage());
        }
        catch (ProductoNoEncontradoException e){
            System.out.println(e.getMessage());
        }
    }
    

}

private static boolean isEmpty(List<Producto> productos) {
    if (productos.isEmpty()) {
        System.out.println("El inventario esta vacio");
        return true;
    } else {
        return false;
    }
}
}
