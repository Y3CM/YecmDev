package Clase_03;

public class Carro implements Vehiculo{

    @Override
    public void moverse() {
       System.out.println("Se mueve sobre 4 ruedas");
    }

    @Override
    public int obtenerVelocidad() {
      return 80;
    }

    @Override
    public void cambiarMarcha(int cambio) {
        System.out.println("Se cambio a : " + cambio + " marcha");

    }

}
