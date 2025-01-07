package Ejercicios.ejercicio_2;

public class Main {
    public static void main(String[] args) {
        Carro vehiculo1 = new Carro("Toyota","Runner x4",200,4);
        Moto vehiculo2 = new Moto("Yamaha", "tx150", 150, false);

        vehiculo1.showDetails();
        vehiculo2.showDetails();
    }
}
