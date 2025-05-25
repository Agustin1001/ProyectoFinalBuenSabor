package org.example.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;
@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DetallePedido extends Base{
    private int cantidad;
    private double subTotal;
    private Articulo articulo;

}
