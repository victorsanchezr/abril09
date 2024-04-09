package com.softtek.modelo.ejercicio1enum;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    private String nombre;
    private int edad;
    private Estado estado;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre) && estado == persona.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, estado);
    }
}
