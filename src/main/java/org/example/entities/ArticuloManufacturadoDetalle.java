package org.example.entities;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ArticuloManufacturadoDetalle {
    private int cantidad;

    private ArticuloInsumo articuloInsumo;


}