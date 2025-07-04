package com.devsenior;

public class Main {
    public static void main(String[] args) {

        System.out.println("SISTEMAS DE RESERVA DE ASIENTOS");

        Vuelo vuelo1 = new Vuelo("VUE-001", 100);
        System.out.println("reservando asientos en el vuelo " + vuelo1.getCodigo());
        System.out.println("Realizando reserva");
        if ( vuelo1.reservarAsiento("Pasajero 1")) {
            System.out.println("Reserva exitosa");
        }
        vuelo1.reservarAsiento("Pasajero 2");
        vuelo1.reservarAsiento("Pasajero 3");
    }
}