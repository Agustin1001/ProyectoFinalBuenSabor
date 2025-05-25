package org.example.Entities;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    private Domicilio domicilio;
    private Set<Categoria> categorias;
    private Set<Promocion> promociones;

    public Sucursal() {}
    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.domicilio = domicilio;
        categorias = new HashSet<>();
        promociones = new HashSet<>();
    }

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
    public String getNombre() {
        return nombre;
    }
    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }
    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }
    public Domicilio getDomicilio() {
        return domicilio;
    }

    @Override
    public String toString() {
        return " org.example.Entities.Sucursal [" +nombre+ ", horarioApertura=" + horarioApertura + ", horarioCierre=" + horarioCierre + ", domicilio=" + domicilio +"]"+"\n"+
                "  Promociones=" + promociones +"\n"+
                "  Categorias = "+ categorias;
    }
}