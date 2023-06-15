// Define el package
package org.rodriguez.app.jardin;

// Import de la clase
//import org.rodriguez.app.hogar.Gato;
//import org.rodriguez.app.hogar.Persona;

// Llama a todas las clases del package
import org.rodriguez.app.hogar.*;
import static org.rodriguez.app.hogar.Persona.saludar;
import static org.rodriguez.app.hogar.Persona.*;
import static org.rodriguez.app.hogar.ColorPelo.*;


public class EjemploPaquetes {
    public static void main(String[] args) {
        // Nombre calificado
        // org.rodriguez.app.hogar.Persona p = new org.rodriguez.app.hogar.Persona();

        // Importado
        Persona p = new Persona();
        p.setNombre("Nahuel");
        p.setApellido("Rodriguez");
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());

        // Mismo package
        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre= GENERO_MASCULINO;

        System.out.println(generoMujer);
        System.out.println(generoHombre);
    }
}
