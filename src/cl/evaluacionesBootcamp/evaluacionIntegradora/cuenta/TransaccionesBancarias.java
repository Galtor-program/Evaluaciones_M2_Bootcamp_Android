package cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta;

import cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces.ITransaccionesBancarias;

/**
 * Clase donde iremos agregando las transacciones bancarias que vayan siendo requeridas
 * en este caso solo agregar dinero a nuestra cuenta y retirar.
 */
public class TransaccionesBancarias extends CuentaBancaria implements ITransaccionesBancarias {
    /**
     *
     * @param saldoInicial solicitamos el saldo inicial
     */
    public TransaccionesBancarias(double saldoInicial) {
        super(saldoInicial);
    }

    /**
     *
     * @param cantidad el parametro cantidad debe ser mayor a 0  para poder realizar el deposito
     */
    public void sumarSaldo(double cantidad) {
        if (cantidad > 0) {
            this.depositar(cantidad);
            System.out.println("Se han sumado " + cantidad + " al saldo. Saldo actual: " + this.obtenerSaldo());
        } else {
            System.out.println("La cantidad a sumar debe ser positiva.");
        }
    }

    /**
     *
     * @param cantidad con esto verificamos que lo que se desea restar sea positivo y no sea mayor a lo que nos quede en la cuenta.
     */
    public void restarSaldo(double cantidad) {
        if (cantidad > 0 && this.obtenerSaldo() >= cantidad) {
            this.saldo -= cantidad;
            System.out.println("Se han restado " + cantidad + " del saldo. Saldo actual: " + this.obtenerSaldo());
        } else if (cantidad > 0) {
            System.out.println("No hay suficiente saldo para restar esa cantidad.");
        } else {
            System.out.println("La cantidad a restar debe ser positiva.");
        }
    }

}
