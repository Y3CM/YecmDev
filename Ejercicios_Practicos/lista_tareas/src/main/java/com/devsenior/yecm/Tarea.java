package com.devsenior.yecm;

public class Tarea {

    private String name;
    private String description;
    private TareaState estado;

    public Tarea(String name, String description) {
        this.name = name;
        this.description = description;
        this.estado = TareaState.PENDIENTE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Name = " + name + "\n Description = " + description + "\n Estado = " + estado;
    }

    public TareaState getEstado() {
        return estado;
    }

}
