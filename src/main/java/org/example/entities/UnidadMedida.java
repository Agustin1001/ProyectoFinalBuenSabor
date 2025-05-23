package org.example.entities;

public class UnidadMedida {

    private String denominacion;

    public UnidadMedida(String denominacion) {
        this.denominacion = denominacion;
    }

    public UnidadMedida() {
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "UnidadMedida{" +
                "denominacion='" + denominacion + '\'' +
                '}';
    }
}

