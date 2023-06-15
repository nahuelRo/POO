package org.rodriguez.sobrecargametodos;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar int : " + Calculadora.sumar(10, 5));
        System.out.println("Sumar float: " + Calculadora.sumar(10.0F, 5F));
        System.out.println("Sumar float-int: " + Calculadora.sumar(10F, 5));
        System.out.println("Sumar int-float: " + Calculadora.sumar(10, 5.0F));
        System.out.println("Sumar double: " + Calculadora.sumar(10.0, 20.0));
        System.out.println("Sumar String: " + Calculadora.sumar("10", "5"));
        System.out.println("Sumar tres int: " + Calculadora.sumar(10, 5, 3));
        System.out.println("Sumar cuatro int: " + Calculadora.sumar(10, 5, 3, 4));
        System.out.println("Sumar float + n int: " + Calculadora.sumar(10.5f, 10, 40, 50));
        System.out.println("Sumar tres double: " + Calculadora.sumar(20.3, 20.3, 32,2));

        System.out.println("Sumar long: " + Calculadora.sumar(10L, 5L));
        System.out.println("Sumar int: " + Calculadora.sumar(10, '@'));
    }


}
