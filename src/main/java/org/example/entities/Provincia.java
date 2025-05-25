package org.example.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Provincia extends Base{
    private String nombre;
    private Pais pais;
}
