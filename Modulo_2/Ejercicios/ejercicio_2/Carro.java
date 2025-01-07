package Ejercicios.ejercicio_2;

public class Carro extends Vehiculo {

    private int numPuertas;

    public Carro(String marca, String modelo, int velocidadMaxima, int numPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void showDetails() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Velocidad máxima: " + getVelocidadMaxima() + " km/h");
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("---");
    }

}
