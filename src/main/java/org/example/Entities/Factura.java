package org.example.Entities;
import lombok.experimental.SuperBuilder;
import org.example.Entities.Enums.FormaPago;
import java.time.LocalDate;
import lombok.*;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.Setter;


@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor


public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private int mpPaymetid;
    private int mpMechantOrderId;
    private String mpPreferenceId;
    private String mpPaymenType;
    private FormaPago formaPago;
    private double totalVenta;



}
