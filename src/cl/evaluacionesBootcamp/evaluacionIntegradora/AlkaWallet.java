/**
 * @author Felipe Toro G.
 */
package cl.evaluacionesBootcamp.evaluacionIntegradora;

import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.CuentaBancaria;
import cl.evaluacionesBootcamp.evaluacionIntegradora.vistas.Menus;

/**
 * Clase Principal de la Billetera digital
 */

public class AlkaWallet {
    /**
     * @param args
     * metodo main
     */
    public static void main(String[] args )  {
        CuentaBancaria.saldoCuenta=0;

        /**
         * llamando al menu para ingresar al sistema o crear una nueva cuenta.
         */
       Menus.menuInicio();
    }
}
