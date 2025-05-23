package org.example.entities;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class DetallePedido {
    private int cantidad;
    private double subTotal;
    private Articulo articulo;



    }
