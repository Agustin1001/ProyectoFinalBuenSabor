package org.example.entities;

public class Provincia {
    private String nombre;
    private Pais pais;

    public Provincia() {
    }
    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return nombre + ", pais =" + pais;
    }
}
