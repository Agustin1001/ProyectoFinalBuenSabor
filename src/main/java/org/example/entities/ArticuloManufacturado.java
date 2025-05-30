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
public class ArticuloManufacturado extends Articulo {

    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;

    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles;

    public void agregarArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle a) {
        if(this.articuloManufacturadoDetalles == null) {
            this.articuloManufacturadoDetalles = new HashSet<ArticuloManufacturadoDetalle>();
        }
        this.articuloManufacturadoDetalles.add(a);
    }
    public void eliminarArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle a) {
        if(this.articuloManufacturadoDetalles != null) {
            this.articuloManufacturadoDetalles.remove(a);
        }
    }
}