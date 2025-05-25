package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Domicilio extends Base{
    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad;

}
