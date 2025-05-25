package org.example.Entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Usuario usuario;
    private Imagen imagen;
    private Domicilio domicilio;

    private Set<Pedido> listaPedidos;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, Usuario usuario, Imagen imagen, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.usuario = usuario;
        this.imagen = imagen;
        this.domicilio = domicilio;
        listaPedidos = new HashSet<>();
    }

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

    @Override
    public String toString() {
        return "org.example.Entities.Cliente [" + "nombreCompleto" + nombre + ", " + apellido + ", telefono='" + telefono + ", email='" + email + ", fechaNacimiento=" + fechaNacimiento +
                "\n" + ", imagen=" + imagen +
                "\n" + ", domicilio=" + domicilio +
                "\n" + ", usuario=" + usuario+
                "\n" + ", listaPedidos=" + listaPedidos + "]";
    }
}