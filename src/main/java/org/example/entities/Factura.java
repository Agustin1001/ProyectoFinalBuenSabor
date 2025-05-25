package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.example.entities.enums.FormaPago;

import java.time.LocalDate;
@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private int mpPaymetiId;
    private int mpMechantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;
}
