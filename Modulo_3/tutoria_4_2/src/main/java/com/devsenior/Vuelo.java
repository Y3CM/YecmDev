package com.devsenior;

import java.util.ArrayList;

public class Vuelo {
    private String codigo;
    private int capacidad;
    private ArrayList<String>pasajeros;

    public Vuelo(String codigo, int capacidad) {
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.pasajeros = new ArrayList<String>();
    }
    public boolean reservarAsiento(String pasajero){
        if (pasajeros.size() < capacidad) {
            pasajeros.add(pasajero);
            return true;
        } 
        System.out.println("No hay asientos disponibles para el vuelo " + codigo);
            return false;
    }
    public String getCodigo() {
        return codigo;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public ArrayList<String> getPasajeros() {
        return pasajeros;
    }

}       