package cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta;

import cl.evaluacionesBootcamp.evaluacionIntegradora.interfaces.IConversor;

import java.util.Scanner;

import static cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.CuentaBancaria.saldoCuenta;

public class Conversor implements IConversor {

    static Scanner input = new Scanner(System.in);
    //Divisas
    public static final double TAZA_EUROS = 0.00098;
    public static final double TAZA_DOLARES = 0.0011;
    public static final double TAZA_YENES = 0.16;
    @Override
    public  double convertirAEuros() {

        if (saldoCuenta > 0) {
            double resultado = saldoCuenta* TAZA_EUROS;
            System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            System.out.println("La conversion al dia de $"+Math.round(saldoCuenta)+ "CPL es " +resultado + "  €");
            System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            System.out.println("Presione Enter para continuar");
            input.nextLine();
        }else{
            System.out.println("Usted no tiene Saldo Suficiente");
        }
        return saldoCuenta;
    }


    public double convertirADolares() {

        if (saldoCuenta > 0) {
            double resultado = saldoCuenta* TAZA_DOLARES;
            System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            System.out.println("La conversion al dia de $"+Math.round(saldoCuenta)+ " CLP  es " +resultado+ " USD ");
            System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            System.out.println("Presione Enter para continuar");
            input.nextLine();
        }else{
            System.out.println("Usted no tiene Saldo Suficiente");
        }
        return saldoCuenta;
    }

    public double convertirAYenes() {

        if (saldoCuenta > 0) {
            double resultado = saldoCuenta* TAZA_YENES;
            System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            System.out.println("La conversion al dia de $"+Math.round(saldoCuenta)+ "CLP  es " + resultado + " ¥");
            System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            System.out.println("Presione Enter para continuar");
            input.nextLine();
        }else{
            System.out.println("Usted no tiene Saldo Suficiente");
        }
        return saldoCuenta;
    }



}
