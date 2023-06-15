package org.rodriguez.sobrecargametodos;

public class Calculadora {

    // No deja instanciar objetos de esta clase!
    private Calculadora() {
    }

    // Metodo
    public static int sumar(int a, int b){
        return a + b;
    }

    // Sobrecarga de metodos
    /*
    *  Tienen que tener más parametros
    *  o diferentes tipos de parametros
    */
    public static float sumar (float x, float y){
        return x + y;
    }

    public static float sumar(int i, float j){
        return i + j;
    }

    public static float sumar(float i, int j){
        return i + j;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(String a, String b) {
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }


    // Varargs
    public static int sumar(int... argumentos){
        int total = 0;
        for (int arg: argumentos) {
            total += arg;
        }
        return total;
    }

    public static float sumar(float a, int... argumentos){
        float total = a;
        for (int arg: argumentos) {
            total += arg;
        }
        return total;
    }

    public static double sumar(double... argumentos){
        double total = 0;
        for (double arg: argumentos) {
            total += arg;
        }
        return total;
    }

}
