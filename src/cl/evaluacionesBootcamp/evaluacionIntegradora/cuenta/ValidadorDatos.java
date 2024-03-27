package cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta;

import cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces.IValidador;

public class ValidadorDatos  implements IValidador {
    @Override
    public boolean validarEdad(int edad) {
        return edad >= 18;
    }

    @Override
    public boolean validarSaldo(int saldo) {
        return saldo >= 100000;
    }
}
