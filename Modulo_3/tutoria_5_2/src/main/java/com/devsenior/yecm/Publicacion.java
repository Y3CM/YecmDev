package com.devsenior.yecm;

public class Publicacion {
private int meGusta;

    public Publicacion() {
        this.meGusta = 0;
    }

    public void darMeGusta() {
        this.meGusta++;
    }

    public int getMeGusta() {
        return this.meGusta;
    }
}
