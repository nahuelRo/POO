package org.rodriguez.clasesabstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String mensaje = "el campo %s debe ser numero";

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
        try{
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
