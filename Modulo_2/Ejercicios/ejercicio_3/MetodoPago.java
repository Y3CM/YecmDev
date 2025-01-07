package Ejercicios.ejercicio_3;

public interface MetodoPago {
    void procesarPago(double monto);
    String obtenerDetalles();
    boolean validarMonto(double monto);
}
