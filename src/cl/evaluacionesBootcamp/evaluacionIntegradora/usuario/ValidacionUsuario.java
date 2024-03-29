package cl.evaluacionesBootcamp.evaluacionIntegradora.usuario;

import cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces.IValidacionUsuario;

/**
 * Validador de Usuario para la creacion de la cuenta.
 */
public class ValidacionUsuario implements IValidacionUsuario {
    /**
     *
     * @param edad recibimos la edad
     * @return si es que la edad es mayor igual a 18
     */
    public boolean validarEdad(int edad) {
        return edad >= 18;
    }

    /**
     *
     * @param saldo recibimos el sado
     * @return si es que el sado es mayor igual a 100000
     */
    public boolean validarSaldoInicial(double saldo) {

        return saldo >= 100000;
    }
}
