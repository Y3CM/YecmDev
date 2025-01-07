package Ejercicios.ejercicio_3;

public class TarjetaRegalo implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
        if(validarMonto(monto)){
            System.out.println("Procesando ...");
            System.out.println("Pago por un valor de $" + monto + " pesos.");
        }else{
        System.out.println("El monto a pagar debe ser mayor o igual a 10.");
        }
    }

    @Override
    public String obtenerDetalles() {
       return "El monto debe ser mayor que 0 y menor o igual a 500.";
    }

    @Override
    public boolean validarMonto(double monto) {
      if(monto > 0 && monto < 500) {
        return true;
    }
        return false;
}
}
