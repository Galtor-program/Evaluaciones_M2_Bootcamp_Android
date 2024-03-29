package cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces;

/**
 * Intefaz de Cuenta bancaria donde indicaremos sus metodos.
 */
public interface ICuentaBancaria {
    /**
     *
     * @param cantidad pedimos la cantidad para depositar
     */
    void depositar(double cantidad);

    /**
     *
     * @return nos permite obtener el saldo para usarlo dentro de nuestro sistema.
     */
    double obtenerSaldo();
}
