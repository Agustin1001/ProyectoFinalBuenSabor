package org.example.Entities;

import lombok.experimental.SuperBuilder;
import org.example.Entities.Enums.TipoPromocion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import lombok.*;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.Setter;

@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Promocion extends Base{
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<Imagen> imagenesPromocional;
    private Set<Articulo> articulos;

    public void agregarImagen(Imagen imagen){
        if (this.imagenesPromocional==null){
            this.imagenesPromocional=new HashSet<>();
        }
        this.imagenesPromocional.add(imagen);
    }

    public void eliminarImagen(Imagen imagen){
        if(this.imagenesPromocional!=null){
            this.imagenesPromocional.remove(imagen);
        }
    }

    public void agregarArticulo(Articulo articulo){
        if (this.articulos==null){
            this.articulos=new HashSet<>();
        }
        this.articulos.add(articulo);
    }

    public void eliminarArticulo(Articulo articulo){
        if(this.articulos!=null){
            this.articulos.remove(articulo);
        }
    }

}
