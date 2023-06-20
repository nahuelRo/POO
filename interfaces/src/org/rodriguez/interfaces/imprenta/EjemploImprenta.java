package org.rodriguez.interfaces.imprenta;

import org.rodriguez.interfaces.imprenta.modelo.*;
import static org.rodriguez.interfaces.imprenta.modelo.Genero.*;
import static org.rodriguez.interfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Resumen laboral", new Persona("John", "Doe"), "Ingeniero de sistemas");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erick", "Gamma"),
                "Patrones de diseño: Elem. Reusables POO"
                , PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Composite"))
                .addPagina(new Pagina("Facade"));



        Informe informe = new Informe("Estudio sobre microservicios", new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        Imprimible objImp = new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola, imprimiendo un objeto generico de una clase anonima!";
            }
        };
        imprimir(objImp);

        System.out.println(TEXTO_DEFECTO);
    }


}
