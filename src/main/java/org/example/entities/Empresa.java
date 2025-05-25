package org.example.entities;
import java.util.HashSet;
import java.util.Set;
import lombok.*;
import lombok.experimental.SuperBuilder;
@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Empresa extends Base {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private Set<Sucursal> sucursales;
    public void agregarSucursal (Sucursal sucursal){
        if(this.sucursales==null){
            this.sucursales = new HashSet<>();
        }
        this.sucursales.add(sucursal);
    }

    public void eliminarSucursal (Sucursal sucursal){
        if(this.sucursales!=null){
            this.sucursales.remove(sucursal);
        }
    }
}