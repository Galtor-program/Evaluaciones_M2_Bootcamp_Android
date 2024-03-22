package cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta;

import static cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.CuentaBancaria.saldoCuenta;

public class Conversor {


    //Divisas
    public static final double TAZA_EUROS = 0.00098;
    public static final double TAZA_DOLARES = 0.0011;
    public static final double TAZA_YENES = 0.16;
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
