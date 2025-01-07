package Clase_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Carro());
        vehiculos.add(new Avion());
        vehiculos.add(new Moto());

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.moverse();
            vehiculo.obtenerVelocidad();
            vehiculo.cambiarMarcha(2);
            System.out.println("---------------------------");
        }
    }
}
