package cl.evaluacionesBootcamp.evaluacionIntegradora.vistas;

import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.CuentaBancaria;
import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.ValidadorDatos;
import cl.evaluacionesBootcamp.evaluacionIntegradora.usuario.Persona;

import java.io.IOException;
import java.util.Scanner;

/**
 * Formulario para registrar al usuario y su cuenta
 */
public class GeneradordeCuentas {

    /**
     * Creacion de los datos de la cuenta.
     */
    public static void crearDatosDeLaCuenta()  {
        Scanner input = new Scanner(System.in);
        String nombreUsuario;
        String apellidoUsuario;
        int edadUsuario;
        String rutUsuario;
        int saldoCuenta = 0;

        /**
         * Solicitamos los datos para crear el usuario y la cuenta
         */
        Logo.logoBrand();
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓ Generador de cuentas Bancarias ▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("Ingrese Nombre del usuario: " );
        nombreUsuario = input.next();
        System.out.println("Ingrese Apellido del usuario: ");
        apellidoUsuario = input.next();
        System.out.println("Ingrese su edad");
        edadUsuario=input.nextInt();
        System.out.println("Ingrese rut del usuario: ");
        rutUsuario = input.next();
        System.out.println("Ingrese Saldo inicial en la cuenta");

        /**
         * Valida un numero para la cuenta
         */
        if (input.hasNextInt()) {
            saldoCuenta = input.nextInt();
        } else {
            System.out.println("Debe ingresar un valor número válido. La cuenta se dejará en CERO");
        }
        /**
         * Implementamos la interface para validar que se cumplan los requerimientos minimos
         */
        ValidadorDatos validador = new ValidadorDatos();
        if (!validador.validarEdad(edadUsuario)) {
            System.out.println("Lo sentimos, debe ser mayor de 18 años para crear una cuenta. Intente nuevamente");
            GeneradordeCuentas.crearDatosDeLaCuenta();
        }

        if (!validador.validarSaldo(saldoCuenta)) {
            System.out.println("Lo sentimos, el saldo inicial debe ser al menos $100000 CLP. Intente nuevamente ");
            GeneradordeCuentas.crearDatosDeLaCuenta();
        }


        /**
         * Enviamos los datos de saldoCuenta a nuestra clase Cuenta
         * Enviamos los datos de nombreUsuario, apellidoUsuario, rutUsuario a nuestra clase persona
         */
        CuentaBancaria cuentaBancaria =  new CuentaBancaria(saldoCuenta);
        Persona persona =  new Persona(nombreUsuario,apellidoUsuario, edadUsuario,rutUsuario, cuentaBancaria);

        /**
         * llamamos al metodo para que nos muestre los datos de la cuenta.
         */
        persona.mostrarDatosDelUsuario();
    }
}
