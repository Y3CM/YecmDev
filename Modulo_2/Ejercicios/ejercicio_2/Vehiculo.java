package Ejercicios.ejercicio_2;

public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int velocidadMaxima;


    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void showDetails(){
        System.out.println("************Vehiculo********");
        System.out.println("Marca: " + marca );
        System.out.println("Modelo: " + modelo );
        System.out.println("Velocidad maxima: " + velocidadMaxima);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    

}
