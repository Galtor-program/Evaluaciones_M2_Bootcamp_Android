package cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Transacciones {
    static Scanner input = new Scanner(System.in);
    public static double saldoCuenta =  CuentaBancaria.saldoCuenta;
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




}
