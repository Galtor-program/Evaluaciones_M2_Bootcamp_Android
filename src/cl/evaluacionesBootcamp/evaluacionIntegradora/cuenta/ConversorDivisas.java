package cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta;

import cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces.IConversorDivisas;

/**
 * Metodo de conversor de divisas
 * donde dejamos Constantes el valor de cada divisa
 */
public class ConversorDivisas  implements IConversorDivisas {
    private final double VALOR_EURO = 0.00095;
    private final double VALOR_DOLAR = 0.010;
    private final double VALOR_YEN = 0.15;

    /**
     *
     * @param saldo que utilizaremos para multiplicar con la constante correspondiente
     */
    public void valorEuro(double saldo) {
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("El saldo en euros es: " + (saldo * VALOR_EURO) + " €");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
    }

    /**
     *
     * @param saldo que utilizaremos para multiplicar con la constante correspondien
     */
    public void valorDolar(double saldo) {
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("El saldo en dólares es: " + (saldo * VALOR_DOLAR) + " $USD" );
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
    }

    /**
     *
     * @param saldo que utilizaremos para multiplicar con la constante correspondien
     */
    public void valorYen(double saldo) {
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("El saldo en yenes es: " + (saldo * VALOR_YEN) + " ¥");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
    }
}
