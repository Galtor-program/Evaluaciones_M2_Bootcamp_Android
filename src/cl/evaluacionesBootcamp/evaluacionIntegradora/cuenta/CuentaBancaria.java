package cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase cuenta donde tendremos el saldo de la cuenta y algunos metodos
 */
public class CuentaBancaria {
    //Divisas
    public static final double TAZA_EUROS = 0.00098;
    public static final double TAZA_DOLARES = 0.0011;
    public static final double TAZA_YENES = 0.16;

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

    /**
     * @return realizamos la suma de saldo y lo devolvemos como saldo cuenta
     */
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
                System.out.println("   SU SALDO EN ESTOS MOMENTOS ES  ");
                System.out.println("       " + saldoCuenta);
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
                System.out.println("   SU SALDO EN ESTOS MOMENTOS ES  ");
                System.out.println("       " + saldoCuenta);
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese solo números enteros.");
                input.nextLine();
            }
        } while (!montoValido);
        return saldoCuenta;
    }

    public static double convertirAEuros() {

        if (saldoCuenta > 0) {
            double resultado = saldoCuenta* TAZA_EUROS;
            System.out.println("La conversion a euros es: " +resultado);
        }else{
            System.out.println("Usted no tiene Saldo Suficiente");
        }
        return saldoCuenta;
    }

    public static double converADolares() {

        if (saldoCuenta > 0) {
            double resultado = saldoCuenta* TAZA_DOLARES;
            System.out.println("La conversion a dolares es: " +resultado);
        }else{
            System.out.println("Usted no tiene Saldo Suficiente");
        }
        return saldoCuenta;
    }

    public static double convertirAYenes() {

        if (saldoCuenta > 0) {
            double resultado = saldoCuenta* TAZA_YENES;
            System.out.println("La conversion a yenes es: " +resultado);
        }else{
            System.out.println("Usted no tiene Saldo Suficiente");
        }
        return saldoCuenta;
    }
}
