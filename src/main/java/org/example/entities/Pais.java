package org.example.entities;

public class Pais {
    private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}