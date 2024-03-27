package cl.evaluacionesBootcamp.evaluacionIntegradora.usuario;

import cl.evaluacionesBootcamp.evaluacionIntegradora.cuenta.CuentaBancaria;
import cl.evaluacionesBootcamp.evaluacionIntegradora.vistas.Menus;

import java.util.Scanner;

/**
 * Clase Persona donde crearemos al usuario de la Cta.
 */
public class Persona {

    public static String nombreUsuario;
    public static String apellidoUsuario;
    public static int edadUsuario;
    private static String rutUsuario;
    public static CuentaBancaria saldocuenta;

    /**
     * constructor vacio
     */
    public Persona() {
    }

    /**
     *
     * @param nombreUsuario recibimos el nombre de usuario desde el GeneradorDeCuentas
     * @param apellidoUsuario recibimos el apellido del usuario desde el GeneradorDeCuentas
     * @param rutUsuario recibimos el rut del usuario desde el GeneradorDeCuentas
     * @param edadUsuario recibimos la edad del usuario desde el GeneradorDeCuentas
     * @param saldoCuentaBancaria recimibos el saldo de la cuenta desde el GeneradorDeCuentas
     */
    public Persona(String nombreUsuario, String apellidoUsuario, int edadUsuario, String rutUsuario, CuentaBancaria saldoCuentaBancaria) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.edadUsuario = edadUsuario;
        this.rutUsuario = rutUsuario;
        this.saldocuenta= saldoCuentaBancaria;

    }

    //getter  de rut por ser private

    /**
     *
     * @return el rut del usuario que esta en private
     */
    public static String getRutUsuario() {
        return rutUsuario;
    }

    /**
     * Metodo para mostrar los datos del usuario y su saldo inicial
     * Ademas se genera un input para saber si el usuario quiere pasar
     * al menu de la cuenta para realizar gestiones.
     */
    public static void mostrarDatosDelUsuario()  {
        Scanner input = new Scanner(System.in);
        String opcion;
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■  CUENTA  CREADA EXITOSAMENTE ☻ ");
        System.out.println("■ NOMBRE: " +nombreUsuario );
        System.out.println("■ APELLIDO: "+apellidoUsuario);
        System.out.println("■ RUT: " +getRutUsuario());
        System.out.println("■ EDAD:" +edadUsuario);
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("   SU SALDO EN ESTOS MOMENTOS ES  ");
        System.out.println("       " +Math.round(saldocuenta.saldoCuenta));
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓ Desea realizar alguna operacion? S/N:   ▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        opcion = input.nextLine().toLowerCase();
        if (opcion.equals("s")){
            Menus.mostrarMenuCuenta();
        }

    }

    /**
     * Una vez que realice una modificacion a la cuenta llamaremos a este metodo para mostrar los cambios de SALDO.
     */
    public static void mostrarDatosActualizados()  {
        Scanner input = new Scanner(System.in);
        String opcion;
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■  CUENTA  ACTUALIZADA EXITOSAMENTE ☻ ");
        System.out.println("■ NOMBRE: " + nombreUsuario);
        System.out.println("■ APELLIDO: " + apellidoUsuario);
        System.out.println("■ RUT: " + getRutUsuario());
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("   SU SALDO EN ESTOS MOMENTOS ES  ");
        System.out.println("       " +Math.round(saldocuenta.saldoCuenta));
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓ Desea realizar alguna operacion? S/N:   ▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        opcion = input.nextLine().toLowerCase();
        if (opcion.equals("s")) {
            Menus.mostrarMenuCuenta();
        }
    }
}
