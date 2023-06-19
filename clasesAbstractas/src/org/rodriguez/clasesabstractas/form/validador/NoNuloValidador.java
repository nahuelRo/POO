package org.rodriguez.clasesabstractas.form.validador;

public class NoNuloValidador extends Validador{

    protected String mensaje = "el campo %s no puede ser nulo";

    @Override
    public String getMensaje() {
       return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean isValido(String valor) {
        return (valor != null);
    }
}
