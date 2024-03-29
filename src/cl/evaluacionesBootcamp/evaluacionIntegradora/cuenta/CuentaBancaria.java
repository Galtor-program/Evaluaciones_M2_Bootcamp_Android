package cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta;

import cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces.ICuentaBancaria;

/**
 * Clase principal de Cuenta Bancaria
 */
public class CuentaBancaria implements ICuentaBancaria {
    double saldo;

    /**
     *
     * @param saldoInicial recibimos el saldo inicial
     */
    public CuentaBancaria(double saldoInicial) {

        this.saldo = saldoInicial;
    }

    /**
     *
     * @param cantidad recibmos la cantidad que va a depositar el usuario la cual obviamente debe ser mayor a 0
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    /**
     *
     * @return envia el saldo de la cuenta a donde lo necesitemos
     */
    public double obtenerSaldo() {

        return saldo;
    }
}

