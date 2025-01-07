package Clase_03;

public class Avion implements Vehiculo{

    @Override
    public void moverse() {

      System.out.println("");
    }

    @Override
    public int obtenerVelocidad() {
        return 300;
    }

    @Override
    public void cambiarMarcha(int cambio) {
        System.out.println("Se cambio a : " + cambio + " marcha");
    }

}
