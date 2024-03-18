package cl.evaluacionesBootcamp.evaluacionIntegradora.menus;

import cl.evaluacionesBootcamp.evaluacionIntegradora.menus.GeneradordeCuentas;

import java.util.Scanner;

/**
 * Menu para inicializar la cuenta
 */
public class Nuevo {
    /**
     * Creamos un metodo que llamamos desde AlkaWallet para inciar el programa.
     */

    public static void crearNuevaCuenta(){
        Scanner input = new Scanner(System.in);
        String creacionCuenta;

        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓ Desea crear una nueva cuenta? S/N:      ▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        creacionCuenta = input.next().toLowerCase();
        if (creacionCuenta.equals("s")) {
            GeneradordeCuentas.crearDatosDeLaCuenta();

        }else if (creacionCuenta.equals("n")) {
            System.out.println("Gracias por utilizar el servicio");
            return;
        }else{
            System.out.println("Opcion incorrecta se finaliza el programa!");
        }
    }
}
