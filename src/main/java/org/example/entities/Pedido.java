package org.example.entities;

import lombok.*;
import org.example.entities.enums.Estado;
import org.example.entities.enums.FormaPago;
import org.example.entities.enums.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Pedido {
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Sucursal sucursal;
    private Domicilio domicilio;
    private Set<DetallePedido> detallesPedido;
    private Factura factura;
    private Set<DetallePedido> detalles;

    public void agregarDetalleAlPedido(DetallePedido detallePedido) {
        if(detallesPedido == null) {
            detallesPedido = new HashSet<>();
        }
        detallesPedido.add(detallePedido);
    }

    public void eliminarDetallePedido(DetallePedido detallePedido) {
        if(detallesPedido != null) {
            detallesPedido.remove(detallePedido);
        }
    }
}

