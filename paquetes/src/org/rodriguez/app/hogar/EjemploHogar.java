package org.rodriguez.app.hogar;

import org.rodriguez.app.jardin.Perro;
import static org.rodriguez.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
