package cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase cuenta donde tendremos el saldo de la cuenta y algunos metodos
 */
public class CuentaBancaria {
     /**
     * variable con nuestro saldo cuenta
     */
    public static double saldoCuenta;


    static Scanner input = new Scanner(System.in);
    /**
     * variable para realizar las operaciones
     */
    public static int i;

    /**
     * Constructor vacio
     */
    public CuentaBancaria() {
    }

    /**
     * @param saldoCuenta aca recibimos el saldo inicial de la cuenta del usuario
     */
    public CuentaBancaria(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }



}
