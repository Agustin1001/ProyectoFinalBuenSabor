package org.example.Entities;

public class Localidad {
    private String nombre;
    private Provincia provincia;

    public Localidad() {
    }

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return nombre + ", provincia=" + provincia;
    }
}
