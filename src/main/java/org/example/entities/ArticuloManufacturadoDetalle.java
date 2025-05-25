package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ArticuloManufacturadoDetalle  extends Base{
    private int cantidad;

    private ArticuloInsumo articuloInsumo;

}