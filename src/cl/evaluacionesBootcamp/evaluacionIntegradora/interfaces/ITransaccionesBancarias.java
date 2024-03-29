package cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces;

/**
 * Intefaz de transaccionesBancarias
 */
public interface ITransaccionesBancarias {
    /**
     *
     * @param cantidad necesitamos la cantidad para el metodo sumarSaldo
     */
    void sumarSaldo(double cantidad);

    /**
     *
     * @param cantidad necesitamos la cantidad para el metodo restarSaldo
     */
    void restarSaldo(double cantidad);
}
