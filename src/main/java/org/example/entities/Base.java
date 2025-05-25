package org.example.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Base implements Serializable {
    private Long id;
    @Builder.Default
    private boolean eliminado = false;

}
