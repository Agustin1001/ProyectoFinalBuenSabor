package org.example.Entities;

import java.util.HashSet;
import java.util.Set;

public class Categoria {

    private String denominacion;

    private Categoria categoriaPadre;
    private Set<Categoria> subCategorias;
    private Set<Articulo> listaArticulos;

    public Categoria() {}

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
        subCategorias = new HashSet<>();
        listaArticulos = new HashSet<>();
        this.categoriaPadre = null;
    }

    public void agregarSubCategoria(Categoria subCategoria) {
        if (this.subCategorias == null) {
            this.subCategorias = new HashSet<>();
        }
        this.subCategorias.add(subCategoria);
        subCategoria.setCategoriaPadre(this);
    }

    public void eliminarSubCategoria(Categoria subCategoria) {
        if (this.subCategorias != null) {
            this.subCategorias.remove(subCategoria);
        }
    }

    public void agregarArticulo(Articulo articulo) {
        if (this.listaArticulos == null) {
            this.listaArticulos = new HashSet<>();
        }
        this.listaArticulos.add(articulo);
    }

    public void aliminarArticulo(Articulo articulo) {
        if (this.listaArticulos != null) {
            this.listaArticulos.remove(articulo);
        }
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    @Override
    public String toString() {

        return "denominacion=" + denominacion + " Padre=" + (categoriaPadre == null ? "No tiene" : categoriaPadre.getDenominacion()) +
                "\n" + "   listaArticulos=" + listaArticulos +
                "\n" + "   subCategorias=" + (subCategorias.isEmpty() ? "No tiene \n" : subCategorias);

    }
}