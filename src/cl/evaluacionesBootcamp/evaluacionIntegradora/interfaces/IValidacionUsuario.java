package cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces;

/**
 * Intefaz de validacion de usuario
 */
public interface IValidacionUsuario {
    /**
     *
     * @param edad indicamos que necesitamos la edad
     * @return retornamos la edad validada
     */
    boolean validarEdad(int edad);

    /**
     *
     * @param saldo indicamos que necesitamos el saldo
     * @return retornamos el saldo validado
     */
    boolean validarSaldoInicial(double saldo);
}
