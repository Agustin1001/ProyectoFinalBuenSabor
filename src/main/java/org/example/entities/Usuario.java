package org.example.entities;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Usuario extends Base{
    private String auth0Id;
    private String username;


}

