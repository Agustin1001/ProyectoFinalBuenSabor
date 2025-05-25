package org.example.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pais extends Base{
    private String nombre;
}