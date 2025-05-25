package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Localidad extends Base{
    private String nombre;
    private Provincia provincia;

}
