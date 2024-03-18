package cl.evaluacionesBootcamp.evaluacionIntegradora.menus;

import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.CuentaBancaria;
import cl.evaluacionesBootcamp.evaluacionIntegradora.usuario.Persona;

import java.util.Scanner;

/**
 * Formulario para registrar al usuario y su cuenta
 */
public class GeneradordeCuentas {

    /**
     * Creacion de los datos de la cuenta.
     */
    public static void crearDatosDeLaCuenta(){
        Scanner input = new Scanner(System.in);
        String nombreUsuario;
        String apellidoUsuario;
        String rutUsuario;
        int saldoCuenta = 0;

        /**
         * Solicitamos los datos para crear el usuario y la cuenta
         */
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓ Generador de cuentas ▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("Ingrese Nombre del usuario: " );
        nombreUsuario = input.next();
        System.out.println("Ingrese Apellido del usuario: ");
        apellidoUsuario = input.next();
        System.out.println("Ingrese rut del usuario: ");
        rutUsuario = input.next();
        System.out.println("Ingrese Saldo inicial en la cuenta");

            if (input.hasNextInt()) {
                saldoCuenta = input.nextInt();
            }else {
                System.out.println("Debe ingresar un valor numero valido la cuenta se dejara en CERO");
            }

        /**
         * Enviamos los datos de saldoCuenta a nuestra clase Cuenta
         * Enviamos los datos de nombreUsuario, apellidoUsuario, rutUsuario a nuestra clase persona
         */
        CuentaBancaria cuentaBancaria =  new CuentaBancaria(saldoCuenta);
        Persona persona =  new Persona(nombreUsuario,apellidoUsuario,rutUsuario, cuentaBancaria);
        /**
         * llamamos al metodo para que nos muestre los datos de la cuenta.
         */
        persona.mostrarDatosDelUsuario();
    }
}
