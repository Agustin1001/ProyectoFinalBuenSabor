package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SuperBuilder
public abstract class Articulo extends Base{
    private String denominacion;
    private double precioVenta;
    private UnidadMedida unidadMedida;
    private Set<Imagen> listaImagenes;

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
}