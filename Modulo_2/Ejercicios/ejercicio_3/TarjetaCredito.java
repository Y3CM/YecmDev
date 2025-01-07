package Ejercicios.ejercicio_3;

public class TarjetaCredito implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
       if(validarMonto(monto) ){
        System.out.println("Procesando...." );
        System.out.println("pago por un valor de $" + monto + " pesos." );
       }
       else{
        System.out.println("El monto a pagar debe ser mayor a cero.");
       }
    }

    @Override
    public String obtenerDetalles() {
      return "Al procesar el pago por medio de tarjeta de credito debe ser un monto o valor mayor a cero para procesar la compra";
    }

    @Override
    public boolean validarMonto(double monto) {
        if (monto > 0) {
            return true;
        }
        return false;
    }
    
}
