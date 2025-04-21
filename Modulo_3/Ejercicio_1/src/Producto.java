public class Producto {
private String nombre;
private int cantidad;

public Producto(String nombre, int cantidad) {
    this.nombre = nombre;
    this.cantidad = cantidad;
}

public String getNombre() {
    return nombre;
}

public int getCantidad() {
    return cantidad;
}

public void setCantidad(int cantidad) throws CantidadInvalidaException {
    if (cantidad < 0) {
        throw new CantidadInvalidaException("La cantidad no puede ser negativa");
    }
    this.cantidad = cantidad;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

  @Override
    public String toString() {
        return nombre + " - Cantidad: " + cantidad;
    }

}