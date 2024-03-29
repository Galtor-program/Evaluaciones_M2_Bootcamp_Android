package cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces;

/**
 * Interface de ConversorDivisas
 */
public interface IConversorDivisas {
    /**
     *
     * @param saldo pedimos el sado
     */
    void valorEuro(double saldo);

    /**
     *
     * @param saldo pedimos el saldo
     */
    void valorDolar(double saldo);

    /**
     *
     * @param saldo pedimos el saldo
     */
    void valorYen(double saldo);
}
