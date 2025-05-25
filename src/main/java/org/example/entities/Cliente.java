package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cliente extends Base {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Usuario usuario;
    private ImagenCliente imagen;
    private Domicilio domicilio;

    private Set<Pedido> listaPedidos;

    public void agregarPedido(Pedido pedido) {
        if(this.listaPedidos == null) {
            this.listaPedidos = new HashSet<>();
        }
        listaPedidos.add(pedido);
    }

    public void eliminarPedido(Pedido pedido) {
        if (this.listaPedidos != null){
            this.listaPedidos.remove(pedido);
        }
    }

}