package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;
@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Categoria extends Base{

    private String denominacion;
    @ToString.Exclude
    private Categoria categoriaPadre;
    private Set<Categoria> subCategorias;
    private Set<Articulo> listaArticulos;

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
}