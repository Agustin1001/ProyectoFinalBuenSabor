package org.example.entities;

import java.util.HashSet;
import java.util.Set;

public abstract class Articulo {
    protected String denominacion;
    protected double precioVenta;

    protected UnidadMedida unidadMedida;
    protected Set<Imagen> listaImagenes;


    public Articulo() {
    }

    public Articulo(String denominacion, double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    public Articulo(String denominacion, double precioVenta, UnidadMedida unidadMedida) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
    }

    public Articulo(String denominacion, double precioVenta, UnidadMedida unidadMedida, Imagen imagen) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
        this.agregarImagen(imagen);
    }

    public void agregarImagen(Imagen imagen) {
        if(this.listaImagenes==null) {
            this.listaImagenes = new HashSet<>();
        }
        this.listaImagenes.add(imagen);
    }

    public void eliminarImagen(Imagen imagen) {
        if(this.listaImagenes!=null) {
            this.listaImagenes.remove(imagen);
        }
    }
    public String getDenominacion() {
        return denominacion;
    }

    @Override
    public String toString() {
        return denominacion + ", precioVenta=" + precioVenta +", unidadMedida=" + unidadMedida+ ", listaImagenes=" + listaImagenes + "]";
    }
}