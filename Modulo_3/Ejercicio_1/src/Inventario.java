import java.util.List;
import java.util.ArrayList;

public class Inventario {

 List<Producto> productos;

public Inventario(){
    productos = new ArrayList<>();
}


public void showInventario(){
    for (Producto producto : productos) {
        System.out.println(producto);
    }
}

public void buscarProducto(String nombre){
    while (true) {
        try {
            for(Producto producto : productos){
                if(producto.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println(producto);
                    break;
                } else {
                    throw new ProductoNoEncontradoException("Producto no encontrado");
                }
        }
    
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.err);
            System.out.println("Intente nuevamente.");
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

public void actualizarCantidad(int cantidad){
    for (Producto producto : productos) {
        try {
            producto.setCantidad(cantidad);
            System.out.println("Cantidad actualizada: " + producto);
            return;
        } catch (CantidadInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

}

}
