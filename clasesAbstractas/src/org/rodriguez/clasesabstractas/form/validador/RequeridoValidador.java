package org.rodriguez.clasesabstractas.form.validador;

public class RequeridoValidador extends Validador{

    protected String mensaje = "el campo %s es requerido";

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
        return (valor != null && valor.length() > 0);
    }
}
