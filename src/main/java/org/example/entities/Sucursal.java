package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    private Domicilio domicilio;
    private Set<Categoria> categorias;
    private Set<Promocion> promociones;



    public void agregarCategoria(Categoria c) {
        if(categorias ==null) {
            categorias = new HashSet<>();
        }
        categorias.add(c);
    }

    public void elimiarCategoria(Categoria c) {
        if(categorias !=null) {
            categorias.remove(c);
        }
    }

    public void agregarPromocion(Promocion p) {
        if(promociones ==null) {
            promociones = new HashSet<>();
        }
        promociones.add(p);
    }

    public void eliminarPromocion(Promocion p) {
        if(promociones !=null) {
            promociones.remove(p);
        }
    }

}