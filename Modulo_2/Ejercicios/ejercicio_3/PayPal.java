package Ejercicios.ejercicio_3;

public class PayPal implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
       if(validarMonto(monto)){
        System.out.println("Procesando...");
        System.out.println("Pago por un valor de $" + monto + " pesos.");
       }
       else{
        System.out.println("El monto a pagar debe estar entre 1 y 10,000 pesos.");
       }
    }

    @Override
    public String obtenerDetalles() {
        return "Al procesar el pago por PayPal el monto debe estar entre $1 y $10,000 pesos";
        
    }

    @Override
    public boolean validarMonto(double monto) {
       if (monto >= 1 && monto <= 10000 ) {
        return true;
       } else {
        return false;
       }
    }
    
}
