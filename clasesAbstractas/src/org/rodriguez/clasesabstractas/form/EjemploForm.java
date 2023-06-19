package org.rodriguez.clasesabstractas.form;

import org.rodriguez.clasesabstractas.form.elementos.*;
import org.rodriguez.clasesabstractas.form.elementos.select.Opcion;
import org.rodriguez.clasesabstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addOpcion(new Opcion("1", "Java").setSelected())
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "PHP"));
        lenguaje.addValidador(new NoNuloValidador());

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+ "' value='" + this.valor + "'>";
            }
        };

        saludar.setValor("Este campo está deshabilitado!");
        username.setValor("");
        password.setValor("");
        email.setValor("john.doecorreo.com");
        edad.setValor("28");
        experiencia.setValor("... más de 10 años de experiencia ...");

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);


        elementos.forEach((e) -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br/>");
        });

        elementos.forEach((e) -> {
            if(!e.esValido()){
                e.getErrores().forEach(err -> System.out.println(e.getNombre()+ ": " + err));
            }
        });
    }
}
