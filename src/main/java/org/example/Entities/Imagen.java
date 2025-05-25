package org.example.Entities;
import lombok.*;
import lombok.experimental.SuperBuilder;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.Setter;

@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Imagen extends Base{
    private String denominacion;
}
