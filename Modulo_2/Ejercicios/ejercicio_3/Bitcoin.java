package Ejercicios.ejercicio_3;

public class Bitcoin implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
        if (validarMonto(monto)) {
            System.out.println("Procesando ...");
            System.out.println("pago por un valor de $" + monto + " pesos.");
        }else{
            System.out.println("El monto a pagar debe ser mayor o igual a 0.001 BTC.");
        }
    }

    @Override
    public String obtenerDetalles() {
        return "El metodo selecciona procesa pagos por Criptomonedas BTC, minimo 0.001 BTC ";
    }

    @Override
    public boolean validarMonto(double monto) {
        if (monto >= 0.001) {
            return true;
        }
        return false;
    }

    
}
