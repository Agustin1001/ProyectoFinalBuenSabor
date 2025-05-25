package org.example.entities;

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
