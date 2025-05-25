package org.example.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class ArticuloManufacturadoDetalle extends Base{
    private int cantidad;

    private ArticuloInsumo articuloInsumo;
}