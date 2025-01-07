package Ejercicios.ejercicio_3;

public class TransferenciaBancaria implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
        if (validarMonto(monto)) {
           System.out.println("Procesando...");
           System.out.println("Pago por un valor de $" + monto + " pesos.");
        }else{
            System.out.println("El monto a transferir debe ser mayor o igual a $10 pesos.");
        }
    }

    @Override
    public String obtenerDetalles() {
        return "Para procesar un pago por transferencia bancaria el monto debe se mayor o igual a $10 pesos";
    }

    @Override
    public boolean validarMonto(double monto) {
        if (monto >= 10) {
            return true;
        }
        return false;
    }
    
}
