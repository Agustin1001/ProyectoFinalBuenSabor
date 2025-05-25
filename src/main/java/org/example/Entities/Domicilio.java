package org.example.Entities;

public class Domicilio {
    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad;

    public Domicilio() {
    }

    public Domicilio(String calle, Integer numero, Integer cp) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
    }
    public Domicilio(String calle, Integer numero, Integer cp, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getCp() {
        return cp;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    @Override
    public String toString() {
        return  calle + ", numero=" + numero + ", cp=" + cp + ", localidad =" + localidad;
    }
}
