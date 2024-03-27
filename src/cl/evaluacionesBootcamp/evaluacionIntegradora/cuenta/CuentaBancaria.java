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
    public static double sumaCuenta() {
        int i;
        boolean inputValido = false;
        do {
            try {
                System.out.println("Ingrese la cantidad que desea agregar a la cuenta:");
                i = input.nextInt();
                saldoCuenta += i;
                inputValido = true;
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
                System.out.println("   EL SALDO BANCARIO ES  ");
                System.out.println("       $" + Math.round(saldoCuenta) + " CLP");
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese solo números enteros.");
                input.nextLine();
            }
        } while (!inputValido);
        return saldoCuenta;
    }

    /**
     * @return realizamos la suma de saldo y la devolvemos como saldo cuenta
     */
    public static double restaCuenta() {
        int i;
        boolean montoValido = false;
        do {
            try {
                System.out.println("Ingrese la cantidad que desea agregar a la cuenta:");
                i = input.nextInt();
                saldoCuenta -= i;
                montoValido = true;
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
                System.out.println("      EL SALDO BANCARIO ES        ");
                System.out.println("       $" + Math.round(saldoCuenta) + " CLP");
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese solo números enteros.");
                input.nextLine();
            }
        } while (!montoValido);
        return saldoCuenta;
    }


}
