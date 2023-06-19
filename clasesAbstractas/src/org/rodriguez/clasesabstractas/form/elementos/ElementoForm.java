package org.rodriguez.clasesabstractas.form.elementos;

import org.rodriguez.clasesabstractas.form.validador.LargoValidador;
import org.rodriguez.clasesabstractas.form.validador.Validador;
import org.rodriguez.clasesabstractas.form.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public List<String> getErrores() {
        return errores;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public boolean esValido(){
        for(Validador v: this.validadores){
            if (!v.isValido(this.valor)){
                if (v instanceof MensajeFormateable){
                    this.errores.add(((MensajeFormateable) v).getMensajeFormateado(nombre));
                } else {
                    this.errores.add(String.format(v.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }

    // Metodo abstracto (Se define pero no se implementa);
    public abstract String dibujarHtml();
}
