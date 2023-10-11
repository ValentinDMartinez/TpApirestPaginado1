package com.facu.restfake.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Autor extends Base{
    private String apellido;
    private String nombre;
    private String biografia;

}
