package org.rodriguez.excepciones.ejemplo;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionPorZeroException {
        if (divisor == 0){
            throw new DivisionPorZeroException("no se puede dividir por cero!");
        }
        return (double) numerador / divisor;
    }

    public double dividir(String numerador, String divisor) throws DivisionPorZeroException, FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        } catch (NumberFormatException e){
            throw new FormatoNumeroException("Debe ingresar un numero en el numerador y divisor");
        }
    }
}
