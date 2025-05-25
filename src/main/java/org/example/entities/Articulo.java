package org.example.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public abstract class Articulo extends Base{
    protected String denominacion;
    protected double precioVenta;

    protected UnidadMedida unidadMedida;
    protected Set<Imagen> listaImagenes;

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