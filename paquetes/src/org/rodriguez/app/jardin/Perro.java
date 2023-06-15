package org.rodriguez.app.jardin;

import org.rodriguez.app.hogar.Persona;

// Restringir que entre a la casa
public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
