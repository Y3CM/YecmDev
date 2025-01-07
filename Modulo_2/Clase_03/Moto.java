package Clase_03;

public class Moto implements Vehiculo{

    @Override
    public void moverse() {
        System.out.println("se mueve a 2 ruedas");
    }

    @Override
    public int obtenerVelocidad() {
        return 125;
    }

    @Override
    public void cambiarMarcha(int cambio) {
        System.out.println("Se cambio a : " + cambio + " marcha");

    }

    public void hacerCaballito(){

    }

}
