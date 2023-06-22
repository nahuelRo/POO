package org.rodriguez.excepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args){

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");

        try {
            double division2 = cal.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        } catch (FormatoNumeroException e) {
            System.out.println("Se detecto una excepción: Ingrese un numero valido: " + e.getMessage());
            e.printStackTrace();
            main(args);
        }
        catch (DivisionPorZeroException ae) {
            System.out.println("Capturamos la excepcion en tiempo de ejecución: " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepcion o sin");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicacion");
    }
}
